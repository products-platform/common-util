package com.product.dtos;

public record InventoryRequest(
        String variantSku,
        Long locationId,
        Integer quantity
) {}
