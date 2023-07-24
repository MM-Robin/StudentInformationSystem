package student.info.system;

//This class is a simple Data Structure to hold the Values of a single Attempt.
public class Attempt {

	public int _year;
	public String _term;
	public String _courseName;
	public int _grade;
	public String _supervisor;

	public Attempt(int year, String term, String courseName, int grade, String supervisor) {
		_year = year;
		_term = term;
		_courseName = courseName;
		_grade = grade;
		_supervisor = supervisor;
	}

}
