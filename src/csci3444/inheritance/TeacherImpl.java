package csci3444.inheritance;

public class TeacherImpl extends PersonBaseImpl implements Teacher {
	private String thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle) {
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}

	@Override
	public String getDetails() {
		return "teacher";
	}

	@Override
	public String teachesFor() {
		return thoughtCourseTitle;
	}

}
