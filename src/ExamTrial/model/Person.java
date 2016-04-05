package ExamTrial.model;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private Animal[] animals;
	
	public Person(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		animals = new Animal[0];
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Animal getAnimal(int index) {
		return animals[index];
	}

	public void deleteAnimal(int index) {
		// First delete the animal itself. It's not really necessary, but highlights the OO principles
		animals[index] = null;
		
		// Then copy the contents, excluding the empty entry, to a temporary array
		Animal[] tempAnimals = new Animal[animals.length-1];
		for (int i=0; i<animals.length; i++) {
			if (i < index) {
				tempAnimals[i] = animals[i];
			}
			else if (i> index) {
				tempAnimals[i] = animals[index+1];
			}
		}
		
		// Finally copy the new contents to the old array
		animals = tempAnimals;
	}
	
	public void addAnimal(Animal animal) {
		// First create a temporary array of animals
		Animal[] tempAnimals = new Animal[animals.length+1];
		for (int i=0; i<animals.length; i++) {
			tempAnimals[i] = animals[i];
		}
		
		// Copy the new animal into the array
		tempAnimals[tempAnimals.length-1] = animal;
		
		// Copy the temporary array to the final one
		animals = tempAnimals;
	}

	public Animal[] getAnimals() {
		return animals;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(firstName);
		result.append(" ");
		result.append(lastName);
		if (animals.length> 0)  {
			result.append(" has animals: ");
			for (int i = 0; i<animals.length; i++) {
				result.append(animals[i].toString());
				if (i<animals.length) {
					result.append(", ");
				}
			}
		}
		return new String(result);
	}
}
