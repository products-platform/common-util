package com.product.dtos;

public record CreateLocationRequest(
        String name,
        String city,
        String state,
        String country,
        String type
) {}
