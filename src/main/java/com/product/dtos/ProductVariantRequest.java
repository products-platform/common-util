package com.product.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ProductVariantRequest(
        Long variantId,
        String size,
        String color,
        String configuration,
        BigDecimal price,
        Integer weightInGrams,
        String description,
        String variantSku,
        Boolean active
) {
}
