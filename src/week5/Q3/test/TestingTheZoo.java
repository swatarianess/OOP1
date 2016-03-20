package week5.Q3.test;

import week5.Q3.domain.*;

import java.util.ArrayList;

public class TestingTheZoo {

	public static void main(String[] args) {
		Zoo myZoo = new Zoo();
/**		Cat minou = new Cat("Minou");
		Cat blackie = new Cat("Blackie");
		Donkey pinto = new Donkey("Pinto");		
		myZoo.addAnimal(minou);
		myZoo.addAnimal(blackie);
		myZoo.addAnimal(pinto);*/
		Cat ginger = new Cat("Ginger");
		myZoo.addAnimal(ginger);
		Elephant dumbo = new Elephant("Dumbo");
		myZoo.addAnimal(dumbo);
		Donkey grey = new Donkey("Grey");
		myZoo.addAnimal(grey);
		
		ArrayList<Animal> animals = myZoo.getAnimals();
		
		System.out.println(myZoo.toString());
		System.out.println();
		System.out.println(animals.toString());
		System.out.println();

		grey.setName("newName");
		animals.add(grey);

		System.out.println(myZoo.toString());
		System.out.println();
		System.out.println(animals.toString()); 
		
/**		System.out.println(myZoo.toString());
		
		for(Animal animal : animals) {
			if(!(animal instanceof Cat)) {
				System.out.println(animal.sound());
			}
		}*/

	}

}
