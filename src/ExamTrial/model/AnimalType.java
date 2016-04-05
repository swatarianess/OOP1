package ExamTrial.model;

public enum AnimalType {

	CAT(true), DOG(true), RABBIT(true), HAMSTER(true), GUINEA_PIG(true),
							COW(false), SHEEP(false), PIG(false), HORSE(false);
	
	private boolean pet;

	private AnimalType(boolean pet) {
		this.pet = pet;
	}

	public boolean isPet() {
		return pet;
	}
}
