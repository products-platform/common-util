package com.product.dtos.customer;

public record AddressResponse(
        Long id,
        String addressType,
        String addressLine1,
        String city,
        String state,
        String pincode,
        Boolean isDefault
) {}
