
public class Computer extends Electronics {
	public boolean laptop, desktop, work, school; 
	
	public Computer(){
		this.laptop=false;
		this.desktop=false;
		this.work=false;
		this.school=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}

	public Computer(boolean laptop,boolean desktop,boolean work,boolean school){
		this.laptop=laptop;
		this.desktop=desktop;
		this.work=work;
		this.school=school;
		setCost(10000);
		setManufacturer("Razer");
		setWeight(20);
		setPower(128);
	}
	
	public String toString(){
		return "\nComputer[ Laptop = "+laptop+"\nDesktop = "+desktop+"\nWork = "+work+"\nSchool = "+school+"\nManufacturers = "+ manufacturers+"\nCost = "+cost+
				"\nWeight = "+weight+"lbs"+"\nPower Usage = "+powerUsage+"]";
	
	
	
	
	
}
}