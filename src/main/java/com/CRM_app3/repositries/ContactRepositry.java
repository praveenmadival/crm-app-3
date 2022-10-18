package com.CRM_app3.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM_app3.entities.Contact;

public interface ContactRepositry extends JpaRepository<Contact, Long> {

}
