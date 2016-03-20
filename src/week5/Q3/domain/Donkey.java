package week5.Q3.domain;

public class Donkey extends Animal {
	
	public Donkey(String name){
		super(name);
	}
	
	/* (non-Javadoc)
	 * @see domain.Animal#sound()
	 */
	@Override
	public String sound(){
		return "IA";
	}
}
