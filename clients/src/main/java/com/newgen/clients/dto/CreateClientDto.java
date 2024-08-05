package com.newgen.clients.dto;

public record CreateClientDto(
        String document,
        String name,
        String email,
        String phone,
        String address
) {
}
