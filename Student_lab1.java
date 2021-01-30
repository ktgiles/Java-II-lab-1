/*Kaitlin Giles, Lab 1 Part 1, 01/18/2021
Create a Student Class, create getter/setter methods
*/

import java.util.Scanner;
public class Student_lab1 {

    //establish variables
    String firstName;
    String lastName;
    String major;
    double GPA;
    int numberOfClasses; //number of classes the student is currently enrolled in
    boolean attending; //true if student is currently classified as "attending classes"
    Scanner input = new Scanner(System.in);

    //constructor method to build student profile
    public Student_lab1(String first, String last, String maj,
                        double grade, int number, boolean att) {
        firstName = first;
        lastName = last;
        major = maj;
        GPA = grade;
        numberOfClasses = number;
        attending = att;
    }

    //this method prints student first name
    public void getFirst() {
      System.out.println("The first name assigned is "  + this.firstName);
    }

    //this method sets student first name
    public void setFirst() {
        System.out.println("Enter the student's first name: ");
        this.firstName = input.nextLine();
    }

    //this method prints student last name
    public void getLast() {
        System.out.println("The last name assigned is " + this.lastName);
    }

    //this method sets student last name
    public void setLast() {
        System.out.println("Enter the student's last name: ");
        this.lastName = input.nextLine();
    }

    //this method prints student's major
    public void getMajor() {
        System.out.println("The student's major is: " + this.major);
    }

    //this method sets student's major
    public void setMajor() {
        System.out.println("Enter the student's major: ");
        this.major = input.nextLine();
    }

    //this method prints student's GPA
    public void getGPA() {
        System.out.println("The student's GPA is " + this.GPA);
    }

    //this method sets student's GPA
    public void setGPA() {
        System.out.println("Enter the student's GPA: ");
        this.GPA = input.nextFloat();
    }

    //this method prints the number of classes student is enrolled in
    public void getNumber() {
        System.out.println("This student is currently enrolled in  " + this.numberOfClasses + " classes");
    }

    //this method sets the number of classes student is enrolled in
    public void setNumber() {
        System.out.println("Enter the number of classes the student is currently enrolled in: ");
        this.numberOfClasses = input.nextInt();
    }

    //this method gets attendance boolean (attending classes if true, not attending if false) and prints outcome
    public void getAttending() {
        if (attending) {
            System.out.println("The student is currently classified as \"attending classes\"");
        } else {
            System.out.println("The student is not currently classified as \"attending classes\"");
        }
    }

    //this method sets attendance boolean - true if attending classes, false if not attending classes
    public void setAttending() {
        System.out.println("Type \"true\" if student is currently classified as attending classes, otherwise type \"false\".");
        String input1 = input.next();
        this.attending = input1.equalsIgnoreCase("True");
    }
}
