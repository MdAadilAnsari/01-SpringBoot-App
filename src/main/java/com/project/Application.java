package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.entity.ContactsMasterEntity;
import com.project.repository.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(Application.class, args);
		
		ContactsMasterRepo contactsRepo = config.getBean(ContactsMasterRepo.class);
		
		System.out.println(" ++++ "+ contactsRepo.getClass().getName());
		
		ContactsMasterEntity entity = new ContactsMasterEntity();
		
		entity.setContactId(103);
		entity.setContactName("Raju");
		entity.setContactNumber(7782828383L);
		
		contactsRepo.save(entity);
		config.close();
	}
	

}
