/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour

    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;

    }

    

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    
}

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCreditPrice() {
        return price;
    }
    
    

    

    public void setCoursePrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
    
}