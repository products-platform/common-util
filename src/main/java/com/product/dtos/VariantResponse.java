package com.product.dtos;

import java.math.BigDecimal;

public record VariantResponse(
        String size,
        String color,
        String configuration,
        BigDecimal price,
        Integer stock
) {}
