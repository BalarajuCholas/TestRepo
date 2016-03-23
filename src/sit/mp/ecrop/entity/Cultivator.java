package sit.mp.ecrop.entity;

public class Cultivator {
	
	private String fname;
	private String lname;
	private String adhar_No;
	private int phone_no;
	public Cultivator(String fname, String lname, String adhar_No, int phone_no) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adhar_No = adhar_No;
		this.phone_no = phone_no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdhar_No() {
		return adhar_No;
	}
	public void setAdhar_No(String adhar_No) {
		this.adhar_No = adhar_No;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

}
