package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Therapist;

import java.util.List;

public interface TherapistService {

    List<Therapist> list();
    Therapist get(Integer id);
    Therapist save(Therapist therapist);
    Therapist login(String email, String hashedPassword);
    void delete(Integer id);
}
