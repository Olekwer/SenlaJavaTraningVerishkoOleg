package oleg.org;

public class User {
	private int id;
	private String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(id).append(" ").append(name);
		return stringBuffer.toString();
	}

}
