package ExamTrial.model;

import java.util.Currency;
import java.util.Locale;

public class Treatment implements Sellable {
	private String name;
	private Currency currency = Currency.getInstance(Locale.getDefault());
	private float price;
	
	public Treatment(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public float getPrice() {
		if (price < 0) { 
			throw new IllegalStateException("Animal has a treatment costing less than zero; cannot be!");
		}
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public Currency getCurrency() {
		return currency;
	}
}
