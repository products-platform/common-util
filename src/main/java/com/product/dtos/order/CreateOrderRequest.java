package com.product.dtos.order;

import java.util.List;

public record CreateOrderRequest(
        Long customerId,
        Long addressId,
        List<OrderItemRequest> items
) {}
