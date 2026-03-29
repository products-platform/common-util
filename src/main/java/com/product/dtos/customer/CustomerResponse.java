package com.product.dtos.customer;

import java.util.List;

public record CustomerResponse(
        Long id,
        String name,
        String email,
        String phone,
        List<AddressResponse> addresses
) {}
