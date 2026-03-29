package com.product.dtos.customer;

import java.util.List;

public record CustomerRequest(
        String name,
        String email,
        String phone,
        List<AddressRequest> addresses
) {}
