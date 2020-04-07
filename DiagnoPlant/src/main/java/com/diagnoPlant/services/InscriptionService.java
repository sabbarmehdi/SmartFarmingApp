package com.diagnoPlant.services;

import com.diagnoPlant.models.Inscription;

public interface InscriptionService {
	void save(Inscription inscription);

    Inscription findByUsername(String username);
}
