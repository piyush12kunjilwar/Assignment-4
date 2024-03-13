/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Persona;

import model.CourseSchedule.CourseLoad;
import model.CourseSchedule.SeatAssignment;
import model.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public void printSemesterInfo(String semester){
        
            System.out.println("Student ID: " + person.getPersonId());
            System.out.println("Course Load\n---------- " + getCourseLoadBySemester(semester)+"----------");
            System.out.println("Average GPA: " + getCourseLoadBySemester(semester).getAverageGPA());
            System.out.println( "Student Spending: $ " + getCourseLoadBySemester(semester).getSemesterSpend() + "\n");
            

    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {
          
        return transcript.getCourseLoadBySemester(semester);
    }

    

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }

    public Person getPerson() {
        return person;
    }
    
    
}
