package sit.mp.ecrop.entity;

public class Insurance {
	
	private int assess_id;
	private String policy_no;
	private float premium_cost;
	private String duration;
	
	public Insurance(int assess_id, String policy_no, float premium_cost,
			String duration) {
		super();
		this.assess_id = assess_id;
		this.policy_no = policy_no;
		this.premium_cost = premium_cost;
		this.duration = duration;
	}

	public int getAssess_id() {
		return assess_id;
	}

	public void setAssess_id(int assess_id) {
		this.assess_id = assess_id;
	}

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}

	public float getPremium_cost() {
		return premium_cost;
	}

	public void setPremium_cost(float premium_cost) {
		this.premium_cost = premium_cost;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
