package com;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {
	
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
    @Transactional
	public void insertUpdateUser(user u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}
    
    public user getUserById(int id) {
    	return this.hibernateTemplate.get(user.class,id);
    }
	
    public List<user> getAllData(){
    	return this.hibernateTemplate.loadAll(user.class);
    }
	
    public void deleteUser(int id) {
    	user u=this.hibernateTemplate.get(user.class,id);
          this.hibernateTemplate.delete(u);
    }
	
}
