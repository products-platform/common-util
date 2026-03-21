package com.product.dtos;

import java.math.BigDecimal;
import java.util.List;

public record ProductRequest(
        Long productId,
        String sku,
        String name,
        String brand,
        String category,
        BigDecimal price,
        Integer weightInGrams,
        String description,
        List<ProductVariantRequest> variants
) {}
