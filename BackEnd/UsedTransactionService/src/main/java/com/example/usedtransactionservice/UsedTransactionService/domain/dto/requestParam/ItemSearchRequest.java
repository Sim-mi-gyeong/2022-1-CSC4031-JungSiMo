package com.example.usedtransactionservice.UsedTransactionService.domain.dto.requestParam;

import lombok.Data;

@Data
public class ItemSearchRequest {

    private Long categoryId;

    private String categoryName;

    private Long itemId;

    private String itemName;

    private String brandName;
}
