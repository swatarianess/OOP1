package week5.Q3.domain;

public class Animal implements Cloneable{
	
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
	
	private int id;
	private String name;
	private static int nextId=0;

	public Animal(String name) {
		super();
		this.name = name;
		id = nextId;
		nextId += 1;
	}
	
	public String sound(){
		return "Don't know.";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nextId
	 */
	public static int getNextId() {
		return nextId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nAnimal [id=" + id + ", name=" + name + ", instanceof "+ getClass() + ", sound="+sound()+"]";
	}
	
}
