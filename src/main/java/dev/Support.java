package dev;

public enum Support {
	DVD ("DVD"), Blu_Ray ("Blu-Ray"), Blu_Ray3d ("Blu-Ray 3d");

	private String name;

	//Constructeur
	Support(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString(){
		return name;
	}
}
