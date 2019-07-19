package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa.entity.Student;

public class ClientClass {
	
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		/*
		em.getTransaction().begin();      //adding
		Student s1=new Student();
		s1.setName("Amit");
		s1.setEmailid("amit@gmail.com");
		em.persist(s1);
		em.flush();
		System.out.println("Record added :"+s1.getRollno()+" "+s1.getName()+" "+s1.getEmailid());
		em.getTransaction().commit();
		*/
		
		/*
		Student s2=em.find(Student.class, 2);     //searching
		System.out.println(s2.getRollno());
		System.out.println(s2.getEmailid());
		System.out.println(s2.getName());
		*/
		
		/*
		Student s3=new Student();			//updating
		s3.setRollno(1);
		s3.setEmailid("Amit123@gmail.com");
		s3.setName("Amit");
		em.getTransaction().begin();
		em.merge(s3);
		em.getTransaction().commit();
		System.out.println(s3.getEmailid()+s3.getName()+s3.getRollno());
		*/
		
		/*
		Student s4=em.find(Student.class, 3);		//deleting
		s4.setRollno(5);
		s4.setEmailid("Sumit123@gmail.com");
		s4.setName("Sumit");
		em.getTransaction().begin();
		em.remove(s4);
		em.getTransaction().commit();
		*/
	}
}
