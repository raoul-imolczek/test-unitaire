package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import eu.eisti.p2k20.fintech.fbo.CurrencyConvertor;
import eu.eisti.p2k20.fintech.fbo.CurrencyEnum;
import eu.eisti.p2k20.fintech.fbo.CurrencyRateService;

public class MockTest {

	@Test
	public void testCurrencyConvertor() {
		
		CurrencyRateService currencyRateService = mock(CurrencyRateService.class);
		when(currencyRateService.getPrice(CurrencyEnum.EUR, CurrencyEnum.EUR)).thenReturn(BigDecimal.ONE);
		when(currencyRateService.getPrice(CurrencyEnum.EUR, CurrencyEnum.GBP)).thenReturn(new BigDecimal("0.88"));
		when(currencyRateService.getPrice(CurrencyEnum.EUR, CurrencyEnum.USD)).thenReturn(new BigDecimal("1.10"));
		when(currencyRateService.getPrice(CurrencyEnum.USD, CurrencyEnum.USD)).thenReturn(BigDecimal.ONE);
		when(currencyRateService.getPrice(CurrencyEnum.USD, CurrencyEnum.EUR)).thenReturn(new BigDecimal("0.91"));
		when(currencyRateService.getPrice(CurrencyEnum.USD, CurrencyEnum.GBP)).thenReturn(new BigDecimal("0.80"));
		when(currencyRateService.getPrice(CurrencyEnum.GBP, CurrencyEnum.GBP)).thenReturn(BigDecimal.ONE);
		when(currencyRateService.getPrice(CurrencyEnum.GBP, CurrencyEnum.EUR)).thenReturn(new BigDecimal("1.13"));
		when(currencyRateService.getPrice(CurrencyEnum.GBP, CurrencyEnum.USD)).thenReturn(new BigDecimal("1.24"));
		
		CurrencyConvertor convertor = new CurrencyConvertor(currencyRateService);
		assertEquals(new BigDecimal("1240.00"), convertor.convert(new BigDecimal("1000.00"), CurrencyEnum.GBP, CurrencyEnum.USD));
	}
	
}

