
public class Playstation extends Electronics{
	boolean ps4, ps3, ps2;
	
	
	
	public Playstation(){
		this.ps3=false;
		this.ps2=false;
		this.ps4=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}

	public Playstation(boolean ps3,boolean ps4, boolean ps2){
		this.ps2=ps2;
		this.ps3=ps3;
		this.ps4=ps4;
		setCost(600);
		setManufacturer("Microsoft");
		setWeight(4);
		setPower(64);
	}
	public String toString(){
		return "PlayStation[ \nPS4 = "+ps4+"\nPS3 = "+ps3+"\nPS2 = "+ps2+"\nManufacturers = "+ manufacturers+"\nCost = "+cost+
				"\nWeight = "+weight+"lbs"+"\nPower Usage = "+powerUsage+"]";

	}
}

