package org.academiadecodigo.hackathon.womanizer.controller;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Video;
import org.academiadecodigo.hackathon.womanizer.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/video")
public class VideoController {

    private VideoService videoService;

    @Autowired
    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Video>> listVideos() {
        return new ResponseEntity<>(videoService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<HttpHeaders> addVideo(@RequestBody Video video, UriComponentsBuilder uriComponentsBuilder) {

        Video savedVideo = videoService.save(video);

        UriComponents uriComponents = uriComponentsBuilder.path("/api/video/" + savedVideo.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
