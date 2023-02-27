package radius.drone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import radius.drone.entity.DroneModel;

public interface DroneModelRepository extends JpaRepository<DroneModel, Integer> {
	
	public DroneModel findOneByName(String model);

}
