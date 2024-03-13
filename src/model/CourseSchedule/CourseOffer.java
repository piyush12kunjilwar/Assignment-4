/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CourseSchedule;

import model.CourseCatalog.Course;
import model.Persona.Faculty.FacultyAssignment;
import model.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    String roomNumber;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
        generatSeats(10);
    }
     
    public void assignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        if(facultyassignment == null){
            return null;
            
        }
        return facultyassignment.getFacultyProfile();


    }

    public String getCourseNumber() {
        return course.getNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRegisteredSeats(){
         Seat s = getEmptySeat();
        if(s == null){
            return seatlist.size();
        }
        return seatlist.indexOf(s);
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    public Course getSubjectCourse(){
        return course;
    }
    public int getCreditHours(){
        return course.getCredits();
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    
    @Override
    public String toString() {
        String value;
        
        value = "";
       
    
         value += "Teacher ID:" + getFacultyProfile().getPerson().getPersonId() + "\n";
         value +=  getCourseNumber() + " " + course.getName();

         return value;
         
    }



}
