package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Video;

import java.util.List;

public interface VideoService {

    List<Video> list();
    Video save(Video video);
}
