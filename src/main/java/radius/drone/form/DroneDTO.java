package radius.drone.form;

public class DroneDTO {

	private String serialNumber;
	private String model;
	private double weight;
	private int currentBattery;
	private String state;
	
	
	
	public DroneDTO(String serialNumber, String model, double weight, int currentBattery, String state) {
		super();
		this.serialNumber = serialNumber;
		this.model = model;
		this.weight = weight;
		this.currentBattery = currentBattery;
		this.state = state;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCurrentBattery() {
		return currentBattery;
	}
	public void setCurrentBattery(int currentBattery) {
		this.currentBattery = currentBattery;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
