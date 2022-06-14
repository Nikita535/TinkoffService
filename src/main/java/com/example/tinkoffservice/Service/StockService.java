package com.example.tinkoffservice.Service;

import com.example.tinkoffservice.dto.*;
import com.example.tinkoffservice.model.Stock;
import ru.tinkoff.invest.openapi.model.rest.Orderbook;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;


public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksDto getStocksByTickers(TickersDto tickers);
    CompletableFuture<Optional<Orderbook>> getOrderBookByFigi(String figi);
    StockPricesDto getPrices(FigiesDto figiesDto);
}
