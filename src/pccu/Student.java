package pccu;

public abstract class Student {
	String id;
	String name;
	
	Student(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}

}
