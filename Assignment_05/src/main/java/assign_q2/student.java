package assign_q2;

public class student {

	 private int id;
	 private String name;
	 private long contact;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	 
	
}
