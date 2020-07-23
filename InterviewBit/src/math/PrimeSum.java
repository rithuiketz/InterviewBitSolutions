package math;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
//https://www.interviewbit.com/problems/prime-sum/
public class PrimeSum {

	@Test
	public void test() 
	{
		System.out.println(Arrays.toString(primesum(17)));
	}

	
	public int[] primesum(int A) 
    {
        int[] prime = {-1,-1};
        for(int i=2;i<=A;i++)
        {
            int rem  = A-i;
            if(isPrime(i) && isPrime(rem))
            {
                prime[0] =i;
                prime[1] =rem;
                return prime;
            }

        }
        return prime;
    }
    public static boolean isPrime(int num)
    {
        if(num <=3)
            return true;
        else
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i == 0)
                    return false;
            }
        }
        return true;
    }
}
