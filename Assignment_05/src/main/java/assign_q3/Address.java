package assign_q3;

public class Address {

	private int H_no;
	private String street;
	public int getH_no() {
		return H_no;
	}
	public void setH_no(int h_no) {
		H_no = h_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [H_no=" + H_no + ", street=" + street + "]";
	}
	
}
