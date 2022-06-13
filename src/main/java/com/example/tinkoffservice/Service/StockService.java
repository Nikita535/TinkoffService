package com.example.tinkoffservice.Service;

import com.example.tinkoffservice.dto.StocksDto;
import com.example.tinkoffservice.dto.TickersDto;
import com.example.tinkoffservice.model.Stock;


public interface StockService {
    Stock getStockByTicker(String ticker);


    StocksDto getStocksByTickers(TickersDto tickers);
}
