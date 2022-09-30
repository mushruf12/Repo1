package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.Palindrome;

public class PalindromeTest {
	@Test
	public void palindrome() {
		Palindrome p = new Palindrome();
		boolean n = p.palindrome(121);
		boolean n2 = p.palindrome(122);
		assertEquals(true,n);
		assertEquals(false,n2);
	}

}
