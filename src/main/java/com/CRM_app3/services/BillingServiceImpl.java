package com.CRM_app3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_app3.entities.Billing;
import com.CRM_app3.repositries.BillingRepositry;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepositry brepo;

	@Override
	public void saveOneBill(Billing bill) {
		brepo.save(bill);
	}

}
