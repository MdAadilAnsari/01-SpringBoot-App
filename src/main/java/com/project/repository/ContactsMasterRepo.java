package com.project.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.entity.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable>{

}
