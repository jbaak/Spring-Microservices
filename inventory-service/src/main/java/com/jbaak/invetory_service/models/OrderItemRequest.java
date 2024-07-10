package com.jbaak.invetory_service.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemRequest {
    private Long id;
    private String sku;
    private Double price;
    private Long  quantity;

}
