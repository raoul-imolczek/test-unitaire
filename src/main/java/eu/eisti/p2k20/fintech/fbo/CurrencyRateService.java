package eu.eisti.p2k20.fintech.fbo;

import java.math.BigDecimal;

public interface CurrencyRateService {

	public BigDecimal getPrice(CurrencyEnum input, CurrencyEnum output);
	
}

