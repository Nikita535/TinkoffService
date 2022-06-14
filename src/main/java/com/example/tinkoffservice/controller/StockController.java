package com.example.tinkoffservice.controller;

import com.example.tinkoffservice.Service.StockService;
import com.example.tinkoffservice.dto.FigiesDto;
import com.example.tinkoffservice.dto.StockPricesDto;
import com.example.tinkoffservice.dto.StocksDto;
import com.example.tinkoffservice.dto.TickersDto;
import com.example.tinkoffservice.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }


    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickers) {
        return stockService.getStocksByTickers(tickers);
    }

    @PostMapping("/prices")
    public StockPricesDto getPrices(@RequestBody FigiesDto figiesDto){
        return stockService.getPrices(figiesDto);
    }

}
