package com.newgen.clients.service.impl;

import com.newgen.clients.dto.CreateClientDto;
import com.newgen.clients.service.ClientService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    @Override
    public CreateClientDto save(CreateClientDto createClientDto) {
        return createClientDto;
    }
}
