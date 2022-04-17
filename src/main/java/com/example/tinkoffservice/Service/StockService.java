package com.example.tinkoffservice.Service;

import com.example.tinkoffservice.model.Stock;
import org.springframework.stereotype.Service;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
