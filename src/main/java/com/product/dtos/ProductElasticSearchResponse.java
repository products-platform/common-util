package com.product.dtos;

import java.math.BigDecimal;
import java.util.List;

public record ProductElasticSearchResponse(
        Long id,
        String name,
        String brand,
        String category,
        BigDecimal price,
        List<VariantResponse> variants
) {}
