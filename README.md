# Employee_Management_System_Springboot(EMS)
- Its a Web Application Project built with SpringBoot.

## EMS main features
- Spring Security is used for authentication and authorization.
- Thymeleaf template engine is used for server side for dynamic content rendering on UI.
- Its a portal for an organisation where both HR and Employee can login with their credentials and some features were allocated to them.
- Post HR login, 
### HR has features as follows
1)<b>My Profile</b>- Where the current session HR can view his/her details.

2)<b>Add Employee</b> - Where HR can add an Employee including his credentials which will be stored in Database and useful while an employee is logging in in the next session.

3)<b>Employee List</b> - HR can view the list of Employees in organisation and delete an Employee too.

4)<b>Allocate Project</b> - HR can allocate an project to an employee using his employee ID 

5)<b>View Project Details</b> - HR can view the list of projects to which an employee is assigned.

- Post Employee login,

 ### Employee has features as follows
 1)<b>My Profile</b> - Current session employee can view his/her profile.
 
 2)<b>Add Project openings blog</b> - An employee can create his/her blog and add the project openings requirement, which will be visible to all the rest of employees.
 
 3)<b>View Project openings blog</b> - An employee can view the list of project openings in the organisation through this.
## Prerequisites
- JDK 17
- Any Database(MySQL preferred).
## Running the Application
1)After importing the project and setup in your IDE, create a database named "users" and create a table named "user_details" and create the columns as similar to the following image and also make sure that the roles should be only HR or EMPLOYEE in uppercase.

<img width="555" alt="image" src="https://user-images.githubusercontent.com/120662260/216760385-06c37b89-156b-4796-a8fd-1440acaaca27.png">

2)Configure your application properties and pom.xml based on the type of database you use.

3)Start running the application after those configurations.

## Post running the application
1)Open your browser and enter localhost:8080/ and our applciation main page will be visible dropdown the Login tab and you will have two options login as HR and login as Employee, please choose the login and enter the credentials you given in database as Username and password.

- The following docx has some screenshots of our working application.Please take a look
- [Employee Management System.docx](https://github.com/Chandrasekhar-22/Employee_Management_System_Springboot/files/10571313/Employee.Management.System.docx)
