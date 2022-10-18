package com.CRM_app3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_app3.entities.Lead;
import com.CRM_app3.repositries.LeadRepositry;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepositry repo;

	@Override
	public void saveOneLead(Lead lead) {
		repo.save(lead);
	}

	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = repo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Lead> findAllLeads() {
		List<Lead> lead = repo.findAll();
		return lead;
	}
	

}
