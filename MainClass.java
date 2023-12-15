package ManyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory f= Persistence.createEntityManagerFactory("deva");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	TouristPlace t1=new TouristPlace();
	t1.setP_name("banglore");
	t1.setPopulation(8765);

	TouristPlace t2=new TouristPlace();
	t1.setP_name("tumkur");
	t1.setPopulation(25560);
	
	ArrayList a=new ArrayList();
	a.add(t1);
	a.add(t2);
	
	Visitors v1=new Visitors();
	v1.setName("ramesh");
	v1.setAge(26);
	v1.setT(a);
	
	Visitors v2=new Visitors();
	v2.setName("suresh");
	v2.setAge(25);
	v2.setT(a);
	
	t.begin();
	m.persist(t1);
	m.persist(t2);
	m.persist(v1);
	m.persist(v2);
	t.commit();

	
}
}
