package ExamTrial.model;

import ExamTrial.util.IllegalParameterException;

public class Pet extends Animal {
	public static final int MAX_WEIGHT = 25; // Maximum weight in kg for a pet; heavier is not a pet!
	private InsuranceCompany insuranceCompany;
	private String insuranceNumber;

	public Pet(String name, AnimalType type) throws IllegalParameterException {
		super(name, type);
		if (!type.isPet()) {
			throw new IllegalParameterException("This animal type is not a pet!");
		}
	}

	public Pet(String name, AnimalType type, InsuranceCompany insuranceCompany, String insuranceNumber) throws IllegalParameterException {
		super(name, type);
		if ((insuranceCompany == null) ^(insuranceNumber == null)) {
			throw new IllegalParameterException("Either give both insurance company and number or neither");
		}
		else {
			this.insuranceCompany = insuranceCompany;
			this.insuranceNumber = insuranceNumber;
		}
	}

	public InsuranceCompany getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	@Override
	public void setWeight(int weight) throws IllegalParameterException {
		super.setWeight(weight);
		if (weight > MAX_WEIGHT) {
			throw new IllegalParameterException("An animal with a weight of " + weight + " cannot be a pet");
		}
	}
}
