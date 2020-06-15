package com.hb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileMapper profileMapper;

    @GetMapping("/profiles")
    public List<Profile> profiles() {
        return profileMapper.getAllProfile();
    }
}
