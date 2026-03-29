package com.product.dtos.customer;

public record AddressRequest(
        String addressType,
        String addressLine1,
        String addressLine2,
        String city,
        String state,
        String pincode,
        String country,
        Boolean isDefault
) {}
