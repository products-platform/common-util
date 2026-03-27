package com.product.dtos;

import java.time.Instant;
import java.util.List;

public record ProductRequest(
        Long productId,
        String sku,
        String name,
        String brand,
        String category,
        List<ProductVariantRequest> variants,
        Boolean active,
        Instant createdAt,
        Instant updatedAt
) {}
