
public class Phone extends Electronics{
	
	public boolean smartPhone;
	public boolean touchScreen;
	public boolean hotSpot;
	public boolean wiFi;
	
	public Phone(){
		this.smartPhone=false;
		this.touchScreen=false;
		this.hotSpot=false;
		this.wiFi=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}
	public Phone(boolean smartPhone, boolean touchScreen, boolean hotSpot, boolean wiFi){
		this.smartPhone=smartPhone;
		this.touchScreen=touchScreen;
		this.hotSpot=hotSpot;
		this.wiFi=wiFi;
		setCost(1200);
		setManufacturer("Apple");
		setWeight(1);
		setPower(128);
	}
	public String toString(){
		return "\nPhone[ Smart Phone = "+smartPhone+"\nTouch Screen = "+touchScreen+"\nHot Spot = "+hotSpot+"\nWifi = "+wiFi+ "\nManufacturers = "+ manufacturers+"\nCost = "+cost+
				"\nWeight = "+weight+"lbs"+"\nPower Usage = "+powerUsage+"]";
	
	
	
	
	
}
}
