package phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		
	super(versionNumber, batteryPercentage, carrier, ringtone);
	}
	
	
	
	@Override
	public void displayInfo() {
		String info = String.format("Galaxy Details:\n Version Number: %s \n Battery Percentage: %s \n Carrier: %s \n Ringtone: %s", this.getBatteryPercentage(),
				this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
		System.out.println(info);	
	}
	
	@Override 
	public String ring() {
		return "Ring Rang Riiinnng";			
	}
	
	@Override 
	public String unlock() {
		return "Unlocking via fingerprint";
	}
}



