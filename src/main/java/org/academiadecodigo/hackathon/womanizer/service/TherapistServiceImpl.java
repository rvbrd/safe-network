package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.TherapistDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Therapist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TherapistServiceImpl implements TherapistService {

    private TherapistDao therapistDao;

    @Autowired
    public void setTherapistService(TherapistDao therapistDao) {
        this.therapistDao = therapistDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Therapist> list() {
        return therapistDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Therapist get(Integer id) {
        return therapistDao.findById(id);
    }

    @Override
    public Therapist login(String email, String hashedPassword) {
        return therapistDao.getByEmailAndPassword(email, hashedPassword);
    }

    @Transactional
    @Override
    public Therapist save(Therapist therapist) {
        return therapistDao.saveOrUpdate(therapist);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        therapistDao.delete(id);
    }
}
