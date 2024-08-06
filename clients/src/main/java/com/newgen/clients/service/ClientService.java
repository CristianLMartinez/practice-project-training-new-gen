package com.newgen.clients.service;

import com.newgen.clients.dto.CreateClientDto;
import org.springframework.stereotype.Service;


public interface ClientService {

    CreateClientDto save(CreateClientDto createClientDto);

}
