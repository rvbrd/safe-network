package org.academiadecodigo.hackathon.womanizer.persistence.dao.jpa;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.VideoDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Video;
import org.springframework.stereotype.Repository;

@Repository
public class JPAVideoDao extends GenericJpaDao<Video> implements VideoDao {

    public JPAVideoDao() {
        super(Video.class);
    }
}
