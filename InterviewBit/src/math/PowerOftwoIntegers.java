package math;

import static org.junit.Assert.*;

import org.junit.Test;

//Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
public class PowerOftwoIntegers {

	@Test
	public void test() {
		int input = 4;
		int op = isPower(input);
		System.out.println(op);
		assertEquals(1, op);
	}

	public int isPower(int A)
	{
		if (A == 1)
			return 1;
		double logA = Math.log(A);
		double size = Math.sqrt(A);
		for (int a = 1; a <= size; a++) {
			for (int p = 2; p <= size; p++) {
				double power = Math.pow(a, p);
				if (power == A) {
					return 1;
				}

				else if (power > A)
					break;
			}
		}

		return 0;
	}

}
