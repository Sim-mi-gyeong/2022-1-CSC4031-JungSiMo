package com.example.usedtransactionservice.controller;

import com.example.usedtransactionservice.domain.dto.requestParam.ItemDetailInfoRequest;
import com.example.usedtransactionservice.domain.dto.requestParam.ItemPriceInfoRequest;
import com.example.usedtransactionservice.domain.dto.responseParam.ItemDetailInfoResponse;
import com.example.usedtransactionservice.service.DetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Detail;

@Slf4j
@RestController
@RequestMapping("api/v1/detail")
@RequiredArgsConstructor
public class DetailController {

    private final DetailService detailService;

    // Item : itemId, categoryId, itemName, itemBrand
    // categoryId 에 따라 repository mapping

    @PostMapping("info")
    public ResponseEntity detailInfo(@RequestBody ItemDetailInfoRequest itemDetailInfoRequest) {

        return detailService.detailInfo(itemDetailInfoRequest.getItemId(), itemDetailInfoRequest.getCategoryId());
    }

    @PostMapping("price/change")
    public ResponseEntity priceChangeInfo(@RequestBody ItemPriceInfoRequest itemPriceInfoRequest) {
        return detailService.priceChangeInfo(itemPriceInfoRequest.getItemId(), itemPriceInfoRequest.getCategoryId(), itemPriceInfoRequest.getItemState(), itemPriceInfoRequest.getItemPricePeriod());
    }


}