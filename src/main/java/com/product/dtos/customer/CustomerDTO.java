package com.product.dtos.customer;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.Instant;

public record CustomerDTO(
        @JsonAlias("id")
        Long userId,
        String email,
        @JsonAlias("first")
        String firstName,
        @JsonAlias("last")
        String lastName,
        String company,
        @JsonAlias("created_at")
        Instant createdAt,
        String country
) {}
