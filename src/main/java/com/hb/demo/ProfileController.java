package com.hb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @GetMapping("/profiles")
    public Profile profiles() {
        return new Profile("biao.he", "123456");
    }
}
