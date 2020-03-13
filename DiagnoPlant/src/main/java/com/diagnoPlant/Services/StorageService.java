package com.diagnoPlant.Services;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	

	void init();

	void store(MultipartFile file);

	Stream<Path> loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename);

	void deleteAll();

	Object getUploadLocation();

	List<Path> listSourceFiles(Object uploadLocation);

}