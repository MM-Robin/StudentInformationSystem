# StudentInformationSystem
Integrated SQL database into Java prototype. Implemented queries to retrieve student data &amp; attempts supervised by professors. Updated ER-Diagram &amp; relational schema to include professors. Modified Java program to display supervisor details. Successful completion enhances the system.


In this project, the main goal was to integrate a SQL database into an existing Java prototype for the Student Information System. The provided Java project already contained the necessary mySQL-Connector for Oracle. To achieve this integration, I referred to the JDBC documentation to establish a connection between the Java application and the MySQL database. This allowed the program to access and manipulate data in the database effectively.

Once the integration was successful, the next step was to implement queries for the database. The first query, called "getAllStudents," was designed to retrieve all the student records from the database and store them in a variable called "result." The second query, known as "getAttemptsForStudents," was created to retrieve all attempts supervised by a specific professor, which was passed as a parameter. These attempts were then stored in the "result" variable.

The project's requirements underwent changes, necessitating the inclusion of professors in the Student Information System. To accommodate this, alterations were made to the ER-Diagram to reflect the new relationships between students, attempts, and professors. A relational schema was then created to update the database structure accordingly, ensuring the system could handle the newly introduced professors with their attributes such as first name, last name, employee number, and research field.

Finally, to complete the modifications, the Java program was updated to display the supervisor's details in the attempts window. This involved making changes to multiple classes related to the "Attempt" entity, allowing the program to show the necessary supervisor information for each attempt.

Throughout the process, meticulous testing was conducted to ensure the system was functioning correctly. After completing all the tasks, the updated project files were uploaded to GitHub, making it easier for the team to collaborate and track changes.

In summary, this project involved integrating a SQL database into a Java prototype, implementing database queries, updating the ER-Diagram and relational schema to include professors, and modifying the Java program to display supervisor details. The successful completion of these tasks enhanced the Student Information System's capabilities and paved the way for further development in the future.
