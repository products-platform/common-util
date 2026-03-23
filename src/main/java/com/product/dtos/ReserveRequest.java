package com.product.dtos;

public record ReserveRequest(
        String variantSku,
        Long locationId,
        Integer quantity,
        String referenceId
) {}
