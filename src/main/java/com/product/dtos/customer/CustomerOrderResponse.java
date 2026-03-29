package com.product.dtos.customer;

public record CustomerOrderResponse(
        Long customerId,
        String name,
        String email,
        String phone,
        Long addressId,
        String addressType,
        String addressLine1,
        String addressLine2,
        String city,
        String state,
        String pincode,
        String country,
        Boolean isDefault
) {}
