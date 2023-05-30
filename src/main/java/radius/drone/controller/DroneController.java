package radius.drone.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import radius.drone.form.DroneDTO;
import radius.drone.repository.DroneRepository;

@RestController
@RequestMapping("/api/v1")
public class DroneController {
	
	@Autowired
	private DroneRepository droneRepository;
	
	@RequestMapping("/register")
	public ResponseEntity<Object> registerDrone(@Valid @RequestBody DroneDTO droneDTO){
		Map<String , Object> result = new HashMap<String, Object>();
		
		result.put("status", "SUCCESS");
		
		result.put("message", "Entity created successfully");
		return new ResponseEntity<Object>(result, HttpStatus.CREATED);
	}

}
