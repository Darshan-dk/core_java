package com.java.equalsandhashcode;

public class Trainee {
	private Integer id;
	private String name;

	public Trainee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + "]";
	}
	// here we are over riding the hashCode and equals method by using the eclipse
	// autogeneration.

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Trainee other = (Trainee) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	// own way of overriding the hashCode and equals method.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) // t1.equals(null);
			return false;

		if (!(obj instanceof Trainee))// t1.equals(Tree)
			return false;
		return (this.getId() == ((Trainee) obj).getId() && (this.getName() == ((Trainee) obj).getName()));

	}

	@Override
	public int hashCode() {
		return id;
	}

}
