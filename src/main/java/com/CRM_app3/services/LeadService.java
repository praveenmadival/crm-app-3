package com.CRM_app3.services;

import java.util.List;

import com.CRM_app3.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> findAllLeads();
}
