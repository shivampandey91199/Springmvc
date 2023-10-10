package assign_q4;

public class student {

	int id;
	String fname, lname, email;
	long contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", contact="
				+ contact + "]";
	}

}
