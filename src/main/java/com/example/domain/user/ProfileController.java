package com.example.domain.user;

import com.example.core.model.Profile;
import com.example.domain.user.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by galih.a.pradana on 7/30/2016.
 */
@RestController
@RequestMapping(value = "/profiles")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @RequestMapping
    public List<Profile> getProfiles() {
        System.out.println("SIZE PROFILES " + profileRepository.findAll().size());
        return profileRepository.findAll();
    }

    @RequestMapping(value = "/no_desc")
    public List<Profile> getProfilesNoDesc() {
        System.out.println("SIZE PROFILES " + profileRepository.findAll().size());
        return profileRepository.findAll();
    }

    @RequestMapping(value = "/{userId}")
    public Profile getProfile(@RequestParam int userId) {
         return profileRepository.findByUserId(userId);
    }
}
