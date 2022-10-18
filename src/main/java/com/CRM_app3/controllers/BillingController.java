package com.CRM_app3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRM_app3.entities.Billing;
import com.CRM_app3.entities.Contact;
import com.CRM_app3.services.BillingService;
import com.CRM_app3.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService csrv;
	
	@Autowired
	private BillingService bsrv;
	
	@RequestMapping("/generateBill")
	public String generateBill(@RequestParam("id") long id, ModelMap map) {
		Contact contact = csrv.getOneContact(id);
		map.addAttribute("contact", contact);
		return "Create_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Billing bill, ModelMap map) {
		bsrv.saveOneBill(bill);
		map.addAttribute("bill", bill);
		return "billing_info";
	}

}
