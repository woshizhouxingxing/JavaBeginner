package com.woshizhouxingxing.utils;

import java.math.BigDecimal;

public class UsdConverter {

    private ExchangeRateService service;

    public UsdConverter(ExchangeRateService service) {
        this.service = service;
    }

    public BigDecimal convertToUsd(BigDecimal converted) {
        return converted.multiply(service.getUsd());
    }

     class ExchangeRateService {
        public BigDecimal getUsd() {
            return BigDecimal.ONE;
        }
    }
}
