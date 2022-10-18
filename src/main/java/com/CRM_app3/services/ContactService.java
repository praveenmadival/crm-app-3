package com.CRM_app3.services;

import java.util.List;

import com.CRM_app3.entities.Contact;

public interface ContactService {
	public void saveOneContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getOneContact(long id);
}
