/*Kaitlin Giles, Lab 1 Part 2, 01/18/2021
Create Student Profiles, Utilize getter/setter methods
*/

public class Giles_lab1 {
    public static void main(String[] args) {

        //establish student object
        Student_lab1 studentLab11 = new Student_lab1("Dean", "Winchester", "Hunting Studies",
                2.70, 4, false);

       //this section uses methods to print all variables for chosen student profile
        studentLab11.getFirst();
        studentLab11.getLast();
        studentLab11.getMajor();
        studentLab11.getGPA();
        studentLab11.getNumber();
        studentLab11.getAttending();

        //this section uses methods to edit variables for chosen student profile
         studentLab11.setFirst();
         studentLab11.setLast();
         studentLab11.setMajor();
         studentLab11.setGPA();
         studentLab11.setNumber();
         studentLab11.setAttending();
    }
}
