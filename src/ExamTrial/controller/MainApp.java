package ExamTrial.controller;

import static ExamTrial.model.AnimalType.COW;
import static ExamTrial.model.AnimalType.CAT;
import static ExamTrial.model.AnimalType.DOG;
import static ExamTrial.model.AnimalType.RABBIT;
import static ExamTrial.model.InsuranceCompany.OHRA;

import java.util.ArrayList;

import ExamTrial.model.Animal;
import ExamTrial.model.Person;
import ExamTrial.model.Pet;
import ExamTrial.model.Treatment;
import ExamTrial.util.IllegalParameterException;

public class MainApp {
	private ArrayList<Animal> pettingZoo = new ArrayList<Animal>();
	Pet fluffy, blackie;
	Animal bella1, bella2, hunter;
	
	{
		bella1 = new Animal("Bella 1", COW);
		pettingZoo.add(bella1);
		bella2 = new Animal("Bella 2", COW);
		pettingZoo.add(bella2);
		fluffy = new Pet("Fluffy", RABBIT);
		pettingZoo.add(fluffy);
		blackie = new Pet("Blackie", DOG);
		pettingZoo.add(blackie);
		hunter = new Pet("Hunter the Cat", CAT);
		pettingZoo.add(hunter);
	}

	public static void main(String[] args) throws IllegalParameterException {
		new MainApp();
	}

	private MainApp() throws IllegalParameterException {
		printZoo();
		
		// Treat fluffy with a few drugs
		fluffy.addTreatment(new Treatment("Antibiotics", 12.0f));
		fluffy.addTreatment(new Treatment("Power food", 8.5f));
		printZoo();
		
		// Set an insurance on hunter. For this, a cast has to be done
		Pet hunterAsPet = (Pet) hunter;
		hunterAsPet.setInsuranceCompany(OHRA);
		hunterAsPet.setInsuranceNumber("11-11-11");
		
		// Create a person and sell Fluffy and blackie to him
		Person buyer = new Person("Joop", "de Koper", "Arena 1 Amsterdam");
		buyer.addAnimal(fluffy);
		pettingZoo.remove(fluffy);
		buyer.addAnimal(blackie);
		pettingZoo.remove(blackie);
		System.out.println(buyer);
		printZoo();
		
		// Give blackie some expensive treatments, then do a refund
		blackie.addTreatment(new Treatment("Anti-cancer", 1000.0f));
		blackie.addTreatment(new Treatment("Anti-cancer", 1000.0f));
		blackie.addTreatment(new Treatment("Anti-cancer", -1000.0f));
		printZoo();
		
		// Print the buyer again
		System.out.println(buyer);
	}
	
	private void printZoo() {
		// Print the zoo
		System.out.println("The current petting zoo looks like: ");
		for (Animal animal: pettingZoo) {
			System.out.println(animal);
		}
		System.out.println("");
	}
}
