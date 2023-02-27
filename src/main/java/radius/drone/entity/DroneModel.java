package radius.drone.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="drone_model")
public class DroneModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="droneModel")
	private List<Drone> drones;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Drone> getDrones() {
		return drones;
	}

	public void setDrones(List<Drone> drones) {
		this.drones = drones;
	}
	
	

}
