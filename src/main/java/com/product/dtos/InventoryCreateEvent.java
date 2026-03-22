package com.product.dtos;

import java.util.List;

public record InventoryCreateEvent(
        Long productId,
        String sku,
        List<InventoryVariantStock> variants
) {}
