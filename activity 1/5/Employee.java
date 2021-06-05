package Activity1;

public class Employee {
	private String name,address,mobile,alldetails;
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//Mobile
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	//address
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String alldetails() {
        return "\nEmployee Details\nName:"+ getName() + "\nAddress:"+ getAddress() + "\nMobile:"+ getMobile();                 
    }
}
