package com.product.dtos;

public record InventoryResponse(
        String variantSku,
        Long locationId,
        Integer availableQty,
        Integer reservedQty
) {}
