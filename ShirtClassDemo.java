package classandobjects;
class ShirtClass{
	//below are properties to identify the class/class level variables
	String color;
	int size;
	int price;
	String companyName;
	
	// Default Constructor : if below constructor is not present in code, 
	//then java will add this by default while compilation
	
	ShirtClass(){
		
	}
	
	void setCompanyName(String strCompanyName)
	{
		companyName = strCompanyName;
	}
	
	String getCompanyName() {
		
		return companyName;
	}
	
	void setPrice(int intPrice)
	{
		price = intPrice;
		
	}
	
	int getPrice()
	{
		return price;
	}
	
}
public class ShirtClassDemo {

	public static void main(String[] args) {
		
		ShirtClass obj =  new ShirtClass();
		obj.setCompanyName("Peter England");
		obj.setPrice(2000);
		
		System.out.println(obj.getCompanyName());
		System.out.println(obj.getPrice());
		
		ShirtClass obj2 = new ShirtClass();
		obj2.setCompanyName("Levis");
		obj2.setPrice(3000);
		
		System.out.println(obj2.getCompanyName());
		System.out.println(obj2.getPrice());
	}
	

}
