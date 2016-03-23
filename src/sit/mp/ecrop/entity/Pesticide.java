package sit.mp.ecrop.entity;

public class Pesticide {
	
	private int assess_id;
	private String name;
	private float quantity;
	private float cost;

	public Pesticide(int assess_id, String name, float quantity, float cost ) {
		super();
		this.assess_id = assess_id;
		this.name = name;
		this.quantity = quantity;
		this.cost=cost;
	}

	public int getAssess_id() {
		return assess_id;
	}

	public void setAssess_id(int assess_id) {
		this.assess_id = assess_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}	

}
