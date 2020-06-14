package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTS_MASTER")
public class ContactsMaster {
	
	@Column(name = "CONTACT_ID")
	Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	String contactName;
	
	@Column(name = "CONTACT_NUMBER")
	Long contactNumber;

}
