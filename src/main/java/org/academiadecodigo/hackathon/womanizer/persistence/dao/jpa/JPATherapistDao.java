package org.academiadecodigo.hackathon.womanizer.persistence.dao.jpa;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.TherapistDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Therapist;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class JPATherapistDao extends GenericJpaDao<Therapist> implements TherapistDao {

    public JPATherapistDao() {
        super(Therapist.class);
    }

    @Override
    public Therapist getByEmailAndPassword(String email, String hashedPassword) {

        TypedQuery<Therapist> query =
                em.createQuery("SELECT t FROM Therapist t WHERE t.email = :email AND t.password = :password", Therapist.class);

        query.setParameter("email", email);
        query.setParameter("password", hashedPassword);

        System.out.println("pass devia ser: " + hashedPassword);
        Therapist therapist = query.getSingleResult();
        return therapist;
    }
}
