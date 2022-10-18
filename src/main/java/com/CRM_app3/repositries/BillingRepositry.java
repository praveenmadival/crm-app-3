package com.CRM_app3.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM_app3.entities.Billing;

public interface BillingRepositry extends JpaRepository<Billing, Long> {

}
