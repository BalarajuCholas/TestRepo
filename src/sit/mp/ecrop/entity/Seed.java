package sit.mp.ecrop.entity;

public class Seed {
	
	private int assess_id;
	private String breed;
	private String supplier;
	private float quantity;
    private float cost;
    
	public Seed(int assess_id, String breed, String supplier, float quantity,
			float cost) {
		super();
		this.assess_id = assess_id;
		this.breed = breed;
		this.supplier = supplier;
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getAssess_id() {
		return assess_id;
	}

	public void setAssess_id(int assess_id) {
		this.assess_id = assess_id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
