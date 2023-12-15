
package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TouristPlace {
@Id
	private String p_name;
	private int population;
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
