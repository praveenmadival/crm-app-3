package com.CRM_app3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRM_app3.entities.Contact;
import com.CRM_app3.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService cserv;
	
	@RequestMapping("/viewallcontacts")
	public String viewAllContacts(ModelMap map) {
		List<Contact> contacts = cserv.getAllContacts();
		map.addAttribute("contacts", contacts);
		return "view_all_contacts";
	}
	
	@RequestMapping("/contactid")
	public String viewOneContact(@RequestParam("id") long id, ModelMap map) {
		Contact cntct = cserv.getOneContact(id);
		map.addAttribute("cntc", cntct);
		return "contact_info";
	}

}
