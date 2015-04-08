
	public class Electronics {
		static int powerUsage, weight, cost;
		static String manufacturers;
		
	public  Electronics(){
		Electronics.powerUsage=0;
		Electronics.weight=0;
		Electronics.cost=0;
		Electronics.manufacturers=null;
	}
	
	public int getPower(){
		return powerUsage;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getCost(){
		return cost;
	}
	
	public String getManufacturers(){
		return manufacturers;
	}
	
	public void setPower(int power){
		Electronics.powerUsage=power;
	}
	
	public void setWeight(int weight){
		Electronics.weight=weight;
	}
	public void setCost(int cost){
		Electronics.cost=cost;
	}
	public void setManufacturer(String manufacturer){
		Electronics.manufacturers=manufacturer;
	}
	public String toString(){
		return "Electronics[ Manufacturers= "+ manufacturers+"\nCost= "+cost+
				"\nWeight= "+weight+"lbs"+"\nPower Usage= "+powerUsage+"]";
	}



	
	
	
	
	
	
	}
