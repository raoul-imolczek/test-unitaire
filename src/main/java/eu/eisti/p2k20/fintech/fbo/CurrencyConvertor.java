package eu.eisti.p2k20.fintech.fbo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConvertor {

	private CurrencyRateService currencyRateService;
	
	public BigDecimal convert(BigDecimal amount, CurrencyEnum input, CurrencyEnum output) {
		return amount.multiply(currencyRateService.getPrice(input, output)).setScale(2, RoundingMode.HALF_UP);
	}
	
	public CurrencyConvertor(CurrencyRateService currencyRateService) {
		this.currencyRateService = currencyRateService;
	}
}


