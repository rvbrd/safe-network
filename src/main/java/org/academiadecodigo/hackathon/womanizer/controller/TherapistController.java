package org.academiadecodigo.hackathon.womanizer.controller;

import org.academiadecodigo.hackathon.womanizer.persistence.model.Therapist;
import org.academiadecodigo.hackathon.womanizer.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.validation.Valid;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/therapist")
public class TherapistController {

    private TherapistService therapistService;

    @Autowired
    public void setTherapistService(TherapistService therapistService) {
        this.therapistService = therapistService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<?> listTherapists() {
        return new ResponseEntity<>(therapistService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public ResponseEntity<?> loginTherapist(@RequestBody Therapist therapist) {

        if(therapist.getEmail() == null || therapist.getPassword() == null) {
            System.out.println("erro, email ou pass sao nulls");
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {
            therapistService.login(therapist.getEmail(), therapist.getPassword());
            System.out.println("login ok");
            return new ResponseEntity<>(therapist, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.POST, path = {"", "/"})
    public ResponseEntity<?> addTherapist(@Valid @RequestBody Therapist therapist, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {
            therapist.setPassword(therapist.getPassword());

            therapistService.save(therapist);

            UriComponents uriComponents = uriComponentsBuilder.path("/api/therapist/").build();
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(uriComponents.toUri());

            return new ResponseEntity<>(headers, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getTherapist(@PathVariable Integer id) {
        Therapist therapist = therapistService.get(id);

        if(therapist == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(therapist, HttpStatus.OK);
    }

}
