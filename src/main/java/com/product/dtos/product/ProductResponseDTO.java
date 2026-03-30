package com.product.dtos.product;

import java.math.BigDecimal;

public record ProductResponseDTO(
        Long productId,
        String sku,
        String name,
        String variantName,
        Long variantId,
        BigDecimal price
) {
    public static ProductResponseDTO empty(Long productId) {
        return new ProductResponseDTO(productId, null, null, null, 10L, new BigDecimal(10));
    }
}
