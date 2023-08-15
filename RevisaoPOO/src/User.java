public abstract class User {
	private String name;
	private String birthDate;
	private int id;
	
	protected User(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}


	public String formatPersonalData() {
		return "ID: " + this.id + "\nNome: " + this.name;
	}
}
