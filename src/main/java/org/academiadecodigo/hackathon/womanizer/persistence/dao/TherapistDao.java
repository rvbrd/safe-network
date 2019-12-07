package org.academiadecodigo.hackathon.womanizer.persistence.dao;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Therapist;

public interface TherapistDao extends Dao<Therapist> {

    Therapist getByEmailAndPassword(String email, String hashedPassword);
}
