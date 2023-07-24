package student.info.system;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//This class is used to access the database. Currently we are using dummy values,
// which are access by using "dummy" as the database connection URL.
public class DatabaseAccessor {

	private Connection _con = null;

	public DatabaseAccessor(String dbUrl, String username, String password) {

		if (dbUrl.equals("dummy")) {
			// when we use "dummy" Entries without DB connection
		} else {
			// the real deal, connecting to the database
			try {
				Class.forName("student.info.system.DatabaseAccessor");
				_con = DriverManager.getConnection(dbUrl, username, password);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	// Task 1.3
	public ArrayList<Student> getAllStudents() throws SQLException {
		// TODO implement SQL Query to get all students and
		// store these Student in the variable result.
		ArrayList<Student> result = new ArrayList<>();

		Statement statement = _con.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Student_info.STUDENT JOIN PROGRAM ON Student.programID = PROGRAM.programID");
		while (resultSet.next()) {
			int studentID = resultSet.getInt("studentID");
			String firstName = resultSet.getString("firstname");
			String lastName = resultSet.getString("lastname");
			String name = resultSet.getString("name");

			Student student = new Student(firstName, lastName, studentID,name );
			result.add(student);
		}
		return result;
	}

	// Task 1.4
	public ArrayList<Attempt> getAttemptsForStudent(Student student) throws SQLException {
		// TODO write a Query that gets all the attempts a student has in the database
		// and
		// store these Attempts int the variable result

		ArrayList<Attempt> result = new ArrayList<>();

		Statement statement = _con.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Student_info.ATTEMPTS JOIN COURSE ON ATTEMPTS.CourseID = COURSE.CourseID " +
				"JOIN Professors ON professors.id = ATTEMPTS.supervisor WHERE ATTEMPTS.studentID=" + student._studentID );
		while (resultSet.next()) {
			int year = resultSet.getInt("Year");
			String term = resultSet.getString("term");
			String _courseName = resultSet.getString("description");
			int _grade = resultSet.getInt("grade");
			String supervisor_fname = resultSet.getString("first_name");
			String supervisor_lname = resultSet.getString("last_name");
			String supervisor = supervisor_fname + " " + supervisor_lname;
			System.out.println("sup " + supervisor);

			Attempt attempt = new Attempt( year, term, _courseName, _grade, supervisor );
			result.add(attempt);
		}
		return result;
	}
}
