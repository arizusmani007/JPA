package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpa.entity.Account;

public class JPQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		String qry="select max(acc.balance) from Account acc";
		TypedQuery<Double> query=em.createQuery(qry,Double.class);
		double acclist=query.getSingleResult();
		System.out.println(acclist);
	
		/*
		Account ac1=new Account();
		ac1.setAccHolderName("Nikhil");
		ac1.setBalance(45000);
		ac1.setMobileNo("9873434334");
		
		Account ac2=new Account();
		ac2.setAccHolderName("Anil");
		ac2.setBalance(45567);
		ac2.setMobileNo("666634334");
		
		Account ac3=new Account();
		ac3.setAccHolderName("Akhil");
		ac3.setBalance(4500078);
		ac3.setMobileNo("987344534334");
		
		Account ac4=new Account();
		ac4.setAccHolderName("Vishaka");
		ac4.setBalance(55000);
		ac4.setMobileNo("434373434334");
		
		em.getTransaction().begin();
		em.persist(ac1);
		em.persist(ac2);
		em.persist(ac3);
		em.persist(ac4);
		em.getTransaction().commit();
		
		System.out.println("Accounts added...");
		*/
	}

}
