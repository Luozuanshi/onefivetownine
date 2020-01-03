package src.main.java.com.atguigu.day24Thread.ObjectIO;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2204302400520804901L;
	int id;
	String street;
	transient String phone;
	public Address(int id, String street, String phone) {
		super();
		this.id = id;
		this.street = street;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", phone=" + phone + "]";
	}
	
	
}
