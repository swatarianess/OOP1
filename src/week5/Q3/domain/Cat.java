package week5.Q3.domain;

public class Cat extends Animal {
	
	public Cat(String name){
		super(name);
	}

	/* (non-Javadoc)
	 * @see domain.Animal#sound()
	 */
	@Override
	public String sound() {
		return "miauw";
	}

}
