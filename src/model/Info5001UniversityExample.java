/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.CourseCatalog.Course;
import model.CourseCatalog.CourseCatalog;
import model.CourseSchedule.CourseLoad;
import model.CourseSchedule.CourseOffer;
import model.CourseSchedule.CourseSchedule;
import model.Department.Department;
import model.Persona.Person;
import model.Persona.PersonDirectory;
import model.Persona.StudentDirectory;
import model.Persona.StudentProfile;
import model.Persona.Faculty.FacultyDirectory;
import model.Persona.Faculty.FacultyProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();

        Course course = coursecatalog.newCourse("App Eng", "INFO 5100", 4);
        Course course1 = coursecatalog.newCourse("Cloud Computing", "INFO 7000", 4);
        Course course2 = coursecatalog.newCourse("Internet Marketing", "INFO 8000", 4);
        Course course3 = coursecatalog.newCourse("Python", "INFO 9000", 4);
        Course course4 = coursecatalog.newCourse("Web Design", "INFO 5000", 4);
        Course course5 = coursecatalog.newCourse("SQL", "INFO 4000", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer1 = courseschedule.newCourseOffer("INFO 5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("INFO 7000");
        CourseOffer courseoffer3 = courseschedule.newCourseOffer("INFO 8000");
        CourseOffer courseoffer4 = courseschedule.newCourseOffer("INFO 9000");
        CourseOffer courseoffer5 = courseschedule.newCourseOffer("INFO 5000");
        CourseOffer courseoffer6 = courseschedule.newCourseOffer("INFO 4000");
        CourseOffer courseoffer7 = courseschedule.newCourseOffer("INFO 5100");
        CourseOffer courseoffer8 = courseschedule.newCourseOffer("INFO 7000");
        CourseOffer courseoffer9 = courseschedule.newCourseOffer("INFO 9000");
        CourseOffer courseoffer10 = courseschedule.newCourseOffer("INFO 4000");

        courseoffer1.generatSeats(10);
        courseoffer2.generatSeats(10);
        courseoffer3.generatSeats(10);
        courseoffer4.generatSeats(10);
        courseoffer5.generatSeats(10);
        courseoffer6.generatSeats(10);
        courseoffer7.generatSeats(10);
        courseoffer8.generatSeats(10);
        courseoffer9.generatSeats(10);
        courseoffer10.generatSeats(10);

        PersonDirectory pd = department.getPersonDirectory();
        Person person1 = pd.newPerson("0112303");
        Person person2 = pd.newPerson("7845632");
        Person person3 = pd.newPerson("9034201");
        Person person4 = pd.newPerson("3456789");
        Person person5 = pd.newPerson("9876543");
        Person person6 = pd.newPerson("1234567");
        Person person7 = pd.newPerson("8901234");
        Person person8 = pd.newPerson("4567890");
        Person person9 = pd.newPerson("5678901");
        Person person10 = pd.newPerson("6789012");
        Person person11 = pd.newPerson("7890123");
        Person person12 = pd.newPerson("8901234");
        Person person13 = pd.newPerson("9012345");
        Person person14 = pd.newPerson("0123456");
        Person person15 = pd.newPerson("5432109");

        StudentDirectory sd = department.getStudentDirectory();

        StudentProfile student1 = sd.newStudentProfile(person1);
        StudentProfile student2 = sd.newStudentProfile(person2);
        StudentProfile student3 = sd.newStudentProfile(person3);
        StudentProfile student4 = sd.newStudentProfile(person4);
        StudentProfile student5 = sd.newStudentProfile(person5);
        StudentProfile student6 = sd.newStudentProfile(person6);
        StudentProfile student7 = sd.newStudentProfile(person7);
        StudentProfile student8 = sd.newStudentProfile(person8);
        StudentProfile student9 = sd.newStudentProfile(person9);
        StudentProfile student10 = sd.newStudentProfile(person10);

        CourseLoad courseload1 = student1.newCourseLoad("Fall2020");
        CourseLoad courseload2 = student2.newCourseLoad("Fall2020");
        CourseLoad courseload3 = student3.newCourseLoad("Fall2020");
        CourseLoad courseload4 = student4.newCourseLoad("Fall2020");
        CourseLoad courseload5 = student5.newCourseLoad("Fall2020");
        CourseLoad courseload6 = student6.newCourseLoad("Fall2020");
        CourseLoad courseload7 = student7.newCourseLoad("Fall2020");
        CourseLoad courseload8 = student8.newCourseLoad("Fall2020");
        CourseLoad courseload9 = student9.newCourseLoad("Fall2020");
        CourseLoad courseload10 = student10.newCourseLoad("Fall2020");

        FacultyDirectory fd = department.getFacultyDirectory();

        FacultyProfile fp1 = fd.newFacultyProfile(person11);
        FacultyProfile fp2 = fd.newFacultyProfile(person12);
        FacultyProfile fp3 = fd.newFacultyProfile(person13);
        FacultyProfile fp4 = fd.newFacultyProfile(person14);
        FacultyProfile fp5 = fd.newFacultyProfile(person15);

        fp1.AssignAsTeacher(courseoffer1);
        fp2.AssignAsTeacher(courseoffer2);
        fp3.AssignAsTeacher(courseoffer3);
        fp4.AssignAsTeacher(courseoffer4);
        fp5.AssignAsTeacher(courseoffer5);
        fp1.AssignAsTeacher(courseoffer6);
        fp2.AssignAsTeacher(courseoffer7);
        fp3.AssignAsTeacher(courseoffer8);
        fp4.AssignAsTeacher(courseoffer9);
        fp5.AssignAsTeacher(courseoffer10);

        //
        courseload1.newSeatAssignment(courseoffer1).setGrade(4.0f); // register student in class
        courseload2.newSeatAssignment(courseoffer1).setGrade(3.9f);
        courseload3.newSeatAssignment(courseoffer1).setGrade(3.8f);
        courseload4.newSeatAssignment(courseoffer1).setGrade(3.7f);
        courseload5.newSeatAssignment(courseoffer1).setGrade(3.6f);
        courseload6.newSeatAssignment(courseoffer1).setGrade(3.5f);
        courseload7.newSeatAssignment(courseoffer1).setGrade(3.4f);
        courseload8.newSeatAssignment(courseoffer1).setGrade(3.3f);
        courseload9.newSeatAssignment(courseoffer1).setGrade(3.2f);
        courseload10.newSeatAssignment(courseoffer1).setGrade(3.1f);
        courseload1.newSeatAssignment(courseoffer2).setGrade(3.0f);
        courseload2.newSeatAssignment(courseoffer2).setGrade(3.9f);
        courseload3.newSeatAssignment(courseoffer2).setGrade(3.8f);
        courseload4.newSeatAssignment(courseoffer2).setGrade(2.6f);
        courseload5.newSeatAssignment(courseoffer2).setGrade(2.8f);
        courseload7.newSeatAssignment(courseoffer2).setGrade(2.9f);
        courseload8.newSeatAssignment(courseoffer2).setGrade(3.0f);
        courseload9.newSeatAssignment(courseoffer2).setGrade(2.1f);
        courseload10.newSeatAssignment(courseoffer2).setGrade(1.1f);

        for(StudentProfile s: sd.getStudentList()){
            s.printSemesterInfo("Fall2020");

        }
        
    }

}
