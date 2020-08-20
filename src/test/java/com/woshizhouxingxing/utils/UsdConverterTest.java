package com.woshizhouxingxing.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class UsdConverterTest {

    @Mock
    private UsdConverter.ExchangeRateService service = Mockito.mock(UsdConverter.ExchangeRateService.class);

    private UsdConverter converter = new UsdConverter(service);

    @Test
    public void testConvertToUsd() {
        Mockito.when(service.getUsd()).thenReturn(BigDecimal.valueOf(5));

        BigDecimal result = converter.convertToUsd(BigDecimal.valueOf(2));
        BigDecimal expected = BigDecimal.valueOf(10);

        Assert.assertEquals(expected, result);
    }
}
