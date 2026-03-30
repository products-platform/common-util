package com.product.dtos;

public record InventoryRequest(
        Long productId,
        Long variantId,
        Integer quantity,
        Integer locationId,
        String variantName
) {
}
