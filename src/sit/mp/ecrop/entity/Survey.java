package sit.mp.ecrop.entity;

public class Survey {
	
	private String survey_no;
	private String owner_name;
	private String soil_color;
	private String area;
	
	public Survey(String survey_no, String owner_name, String soil_color,
			String area) {
		super();
		this.survey_no = survey_no;
		this.owner_name = owner_name;
		this.soil_color = soil_color;
		this.area = area;
	}

	public String getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getSoil_color() {
		return soil_color;
	}

	public void setSoil_color(String soil_color) {
		this.soil_color = soil_color;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
