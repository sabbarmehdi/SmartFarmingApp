'use strict';

var UploadForm = document.querySelector('#UploadForm');
var FileUploadInput = document.querySelector('#FileUploadInput');
var FileUploadError = document.querySelector('#FileUploadError');
var FileUploadSuccess = document.querySelector('#FileUploadSuccess');

function uploadSingleFile(file) {
    var formData = new FormData();
    formData.append("file", file);

    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/uploadFile");

    xhr.onload = function() {
        console.log(xhr.responseText);
        var response = JSON.parse(xhr.responseText);
        if(xhr.status == 200) {
            FileUploadError.style.display = "none";
            FileUploadSuccess.innerHTML = "<p>File Uploaded Successfully.</p><p>DownloadUrl : <a href='" + response.fileDownloadUri + "' target='_blank'>" + response.fileDownloadUri + "</a></p>";
            FileUploadSuccess.style.display = "block";
        } else {
            FileUploadSuccess.style.display = "none";
            FileUploadError.innerHTML = (response && response.message) || "Some Error Occurred";
        }
    }

    xhr.send(formData);
}


UploadForm.addEventListener('submit', function(event){
    var files = FileUploadInput.files;
    if(files.length === 0) {
        FileUploadError.innerHTML = "Please select a file";
        FileUploadError.style.display = "block";
    }
    uploadFile(files[0]);
    event.preventDefault();
}, true);



