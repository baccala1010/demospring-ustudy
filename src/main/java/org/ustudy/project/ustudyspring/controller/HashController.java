package org.ustudy.project.ustudyspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/hash")
    public String hash(@RequestParam String input) {
        return passwordEncoder.encode(input);
    }
}