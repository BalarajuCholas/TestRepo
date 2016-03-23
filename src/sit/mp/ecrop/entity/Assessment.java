package sit.mp.ecrop.entity;

public class Assessment {
	
	private int survey_id;
	private int year;
	private String start_date;
	private String end_date;
	private String area;
	private String crop;
	private float predicted_yield;
	private float actual_yield;
	private int cultivator_id;
	private float longitude;
	private float lattitude;
	
	

	public Assessment(int survey_id, int year, String start_date,
			String end_date, String area, String crop, float predicted_yield,
			float actual_yield, int cultivator_id, float longitude,
			float lattitude) {
		super();
		this.survey_id = survey_id;
		this.year = year;
		this.start_date = start_date;
		this.end_date = end_date;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
		this.actual_yield = actual_yield;
		this.cultivator_id = cultivator_id;
		this.longitude = longitude;
		this.lattitude = lattitude;
	}

	public int getSurvey_id() {
		return survey_id;
	}

	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public float getPredicted_yield() {
		return predicted_yield;
	}

	public void setPredicted_yield(float predicted_yield) {
		this.predicted_yield = predicted_yield;
	}

	public float getActual_yield() {
		return actual_yield;
	}

	public void setActual_yield(float actual_yield) {
		this.actual_yield = actual_yield;
	}

	public int getCultivator_id() {
		return cultivator_id;
	}

	public void setCultivator_id(int cultivator_id) {
		this.cultivator_id = cultivator_id;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLattitude() {
		return lattitude;
	}

	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}

}
