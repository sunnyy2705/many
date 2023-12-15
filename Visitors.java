package ManyToMany;

import javax.persistence.ManyToMany;
import java.util.List;

public class Visitors {

	private String name;
	private int age;
	@ManyToMany
	private List<TouristPlace> t;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<TouristPlace> getT() {
		return t;
	}
	public void setT(List<TouristPlace> t) {
		this.t = t;
	}
	
	}
	

