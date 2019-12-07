package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.dao.VideoDao;
import org.academiadecodigo.hackathon.womanizer.persistence.model.Video;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    private VideoDao videoDao;

    @Autowired
    public void setVideoDao(VideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Video> list() {
        return videoDao.findAll();
    }

    @Transactional
    @Override
    public Video save(Video video) {
        return videoDao.saveOrUpdate(video);
    }
}
