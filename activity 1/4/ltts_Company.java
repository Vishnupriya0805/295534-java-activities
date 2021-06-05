package Activity1;

public class ltts_Company {
	private String name,address,mobile,alldetails;
	
	//company name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//employee
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
			
	public String getMobile() {
		return mobile;
	}
			
	//team lead
	public void setAddress(String address) {
		this.address = address;
	}
			
	public String getAddress() {
		return address;
	}
			
	public String alldetails() {
		 return "\nName:"+ getName() + "\nEmployee:"+ getAddress() + "\nLead:"+ getMobile();                 
	}
}
