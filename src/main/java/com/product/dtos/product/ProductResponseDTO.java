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
}
