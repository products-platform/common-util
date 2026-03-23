package com.product.dtos;

public record LocationResponse(
        Long id,
        String name,
        String city,
        String state,
        String country,
        String type,
        Boolean active
) {}
