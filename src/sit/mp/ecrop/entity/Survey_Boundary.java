package sit.mp.ecrop.entity;

public class Survey_Boundary {
	

	private String survey_no;
	private int point;
	private float longitude;
	private float latitude;
	
	public Survey_Boundary(String survey_no, int point, float longitude,
			float latitude) {
		super();
		this.survey_no = survey_no;
		this.point = point;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

}
