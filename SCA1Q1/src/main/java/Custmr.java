import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import javax.annotation.Resource;

public class Custmr {
	
	int customerId;
	String customerName;
	long customerContact;
	Add customerAdd;
	public int getCustmrId() {
		return customerId;
	}
	public void setCustmrId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustmrName() {
		return customerName;
	}
	public void setCustmrName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustmrContact() {
		return customerContact;
	}
	public void setCustmrContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Add getCustmrAdd() {
		return customerAdd;
	}
	
	public void setCustmrAdd(Add customerAdd) {
		this.customerAdd = customerAdd;
	}
	
	public void printDetails() {
		System.out.println("Custmr ID = "+this.customerId);
		System.out.println("Custmr Name = "+this.customerName);
		System.out.println("Custmr Contact = "+this.customerContact);
		System.out.println("Custmr Add is = ");
		System.out.println("Street :" +getCustmrAdd().getStreet());
		System.out.println("City :" +getCustmrAdd().getCity());
		System.out.println("Zip :" +getCustmrAdd().getZip());
		System.out.println("Country :" +getCustmrAdd().getCountry());
	}

}
