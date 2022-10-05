package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest {
	@Test
	public void prime() {
		Prime p = new Prime();
		Boolean n=p.prime(2);
		assertEquals(true,n);
		Boolean n1=p.prime(4);
		assertEquals(false,n1);
		
		
	}

}
