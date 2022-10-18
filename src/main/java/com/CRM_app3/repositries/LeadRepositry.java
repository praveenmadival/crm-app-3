package com.CRM_app3.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM_app3.entities.Lead;

public interface LeadRepositry extends JpaRepository<Lead, Long> {

}
