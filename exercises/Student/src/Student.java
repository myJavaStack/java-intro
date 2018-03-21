/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IT
 */
public class Student {

    private String name; // name has default value null
    private int age; // age has default value 0
    private boolean isScienceMajor; // isScienceMajor has default value false
    private char gender; // c has default value '\u0000'

    public Student() {
        name = "";
        age = 0;
        isScienceMajor = false;
        gender = 'F';
        
    }

    public Student(String nameN, int ageN, boolean isScienceMajorN, char genderN) {
        name = nameN;
        age = ageN;
        isScienceMajor = isScienceMajorN;
        gender = genderN;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameN) {
        name = nameN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageN) {
        age = ageN;
    }

    public boolean isIsScienceMajor() {
        return isScienceMajor;
    }

    public void setIsScienceMajor(boolean isScienceMajorN) {
        isScienceMajor = isScienceMajorN;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char genderN) {
        gender = genderN;
    }

}
