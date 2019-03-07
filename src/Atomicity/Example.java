package Atomicity;

import java.math.BigInteger;
import java.util.ArrayList;

public class Example {
	static ArrayList<BigInteger> factors(BigInteger num){
		BigInteger curr  =  num;

		//BigInteger fac = new BigInteger("2");
		//This way of initializing BigInteger is preferred over the above mentioned way because.
		//This caches and reuses it instead of recreating the object many times.
		BigInteger fac = BigInteger.valueOf(2);
		ArrayList<BigInteger> factors = new ArrayList<>();
		
		
		
		return factors;
	}
}
