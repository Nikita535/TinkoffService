package com.example.tinkoffservice.controller;

import com.example.tinkoffservice.Service.StockService;
import com.example.tinkoffservice.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockController {
    @Autowired
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker){
        return stockService.getStockByTicker(ticker);
    }
}
