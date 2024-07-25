package com.newgen.clients.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok("Version 1.0.0");
    }

}
