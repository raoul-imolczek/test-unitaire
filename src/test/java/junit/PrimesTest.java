package junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import eu.eisti.p2k20.fintech.fbo.PrimeFinder;

public class PrimesTest {

	@Test
	public void testPrimeFinder() {
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		assertArrayEquals(primes, PrimeFinder.getPrimes(10));
	}
	
}

