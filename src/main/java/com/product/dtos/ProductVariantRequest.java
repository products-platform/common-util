package com.product.dtos;

import java.math.BigDecimal;

public record ProductVariantRequest(
        Long variantId,
        String size,
        String color,
        String configuration,
        BigDecimal price,
        Integer weightInGrams,
        String description,
        String variantSku,
        Integer stock,
        Boolean active
) {
}
