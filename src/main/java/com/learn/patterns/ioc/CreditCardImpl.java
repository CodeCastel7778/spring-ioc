package com.learn.patterns.ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {

	@Override
	public void makePayment() {
		System.out.println("Payment Made");
	}

}
