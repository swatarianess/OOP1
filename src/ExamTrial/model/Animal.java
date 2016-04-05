package ExamTrial.model;

import java.util.Currency;
import java.util.Locale;

import ExamTrial.util.IllegalParameterException;

public class Animal implements Comparable<Animal>, Sellable {
	private String name;
	protected int weight;
	private AnimalType type;
	private Treatment[] treatments;
	
	public Animal(String name, AnimalType type) {
		super();
		this.name = name;
		this.type = type;
		this.treatments = new Treatment[0];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) throws IllegalParameterException {
		this.weight = weight;
	}

	public AnimalType getType() {
		return type;
	}
	
	public String toString() {
		return type.toString() + " " + name + ", price: " + getPrice() + " " + getCurrency();
	}
	
	public void addTreatment(Treatment treatment) {
		// Create a new array of treatments
		Treatment[] tempTreatments = new Treatment[treatments.length+1];
		
		// Copy contents of the old one to the temporary one
		for (int i=0; i<treatments.length; i++) {
			tempTreatments[i] = treatments[i];
		}
		
		// Add the new one to the temporary array
		tempTreatments[tempTreatments.length-1] = treatment;
		
		// Set the new array
		treatments = tempTreatments;
	}
	
	@Override
	public int compareTo(Animal other) {
		return name.compareTo(other.name);
	}



	@Override
	public Currency getCurrency() {
		if (treatments.length == 0) {
			return Currency.getInstance(Locale.getDefault());
		}
		else {
			return treatments[0].getCurrency();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public float getPrice() {
		if (treatments.length == 0) {
			return 0;
		}
		else {
			float result = 0;
			for (Treatment treatment: treatments) {
				try {
					result += treatment.getPrice();
				}
				catch (IllegalStateException e) {
					throw new IllegalStateException("This is a weird way to handle state consistency....", e);
				}
			}
			return result;
		}
	}
}
