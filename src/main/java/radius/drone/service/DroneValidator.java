package radius.drone.service;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import radius.drone.form.DroneDTO;

@Component
public class DroneValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return DroneDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors e) {
		 DroneDTO form = (DroneDTO)target;
		 if(form.getSerialNumber().length()>100 || form.getSerialNumber().length()==0)
		 e.rejectValue("serialNumber", "INVALID SERIAL NUMBER LENGTH");
		 if(form.getWeight()>500 || form.getWeight()<=0)
		 e.rejectValue("Drone weight", "INVALID DRONE WEIGHT");
		 if(form.getCurrentBattery()>100 || form.getCurrentBattery()<0)
		 e.rejectValue("Drone battery", "INVALID BATTERY PERCENTAGE");
		 
	}

}
