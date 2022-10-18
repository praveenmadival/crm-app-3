package com.CRM_app3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_app3.entities.Contact;
import com.CRM_app3.repositries.ContactRepositry;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepositry crepo;

	@Override
	public void saveOneContact(Contact contact) {
		crepo.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = crepo.findAll();
		return findAll;
	}

	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = crepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
