package com.CRM_app3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRM_app3.entities.Contact;
import com.CRM_app3.entities.Lead;
import com.CRM_app3.services.ContactService;
import com.CRM_app3.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService srv;
	
	@Autowired
	private ContactService csrv;
	
	@RequestMapping("/l")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String readCreateLeadPage(@ModelAttribute("lead") Lead lead, ModelMap map) {
		srv.saveOneLead(lead);
		map.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/saveContact")
	public String readLeadInfo(@RequestParam("id") long id, ModelMap map) {
		Lead lead = srv.getOneLead(id);
		
		Contact c = new Contact();
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		
		csrv.saveOneContact(c);
		srv.deleteOneLead(id);
		List<Lead> led = srv.findAllLeads();
		map.addAttribute("lead", led);
		return "all_all_leads";
	}
	
	@RequestMapping("/allLeads")
	public String getAllLeads(ModelMap map) {
		List<Lead> lead = srv.findAllLeads();
		map.addAttribute("lead", lead);
		return "all_all_leads";
	}
	
	@RequestMapping("/convertLead")
	public String viewLead(@RequestParam("id") long id, ModelMap map) {
		Lead ld = srv.getOneLead(id);
		map.addAttribute("lead", ld);
		return "lead_info";
	}

}