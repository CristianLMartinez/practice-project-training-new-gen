package com.newgen.clients.controller;

import com.newgen.clients.dto.CreateClientDto;
import com.newgen.clients.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<CreateClientDto> createClient(@RequestBody CreateClientDto clientDto) {
        var savedClient = clientService.save(clientDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedClient);
    }


    @GetMapping
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok("Version 1.0.0");
    }


}