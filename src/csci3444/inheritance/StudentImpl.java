package csci3444.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student {
	private String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle ) {
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	

	@Override
	public String getDetails() {
		return "student";
	}

	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}

}
