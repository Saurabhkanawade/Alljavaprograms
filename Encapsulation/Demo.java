package Encapsulation;

class Demo {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Demo s = new Demo();

		s.setId(101);
		s.setName("saurabh");

		System.out.println(s.getId() + " " + s.getName());

	}

}
