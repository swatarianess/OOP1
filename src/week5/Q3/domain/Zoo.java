package week5.Q3.domain;

import java.util.ArrayList;

public class Zoo {
	
	ArrayList<Animal> animals = new ArrayList<>();

	/**
	 * @return the animals
	 */
	public ArrayList<Animal> getAnimals() {
		ArrayList<Animal> a = new ArrayList<>();
		for(Animal animal: animals){
			a.add((Animal)animal.clone());
		}
		return a;
	}

	
	public Zoo(){
		super();
	}
	/**
	 * @param animal to add to the zoo
	 */
	public void addAnimal(Animal animal) {
		//Check if the animal is valid, if so
		animals.add(animal);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zoo [animals=" + animals + "]";
	}	
}
