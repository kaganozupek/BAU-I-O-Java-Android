package com.company;

/**
 * Created by kaganozupek on 10/11/15.
 */
public class Student extends People {


    public int studentNumber;

    public void printStudentInfo()
    {
        String printed = "";

        printed = printed + this.getName() + " " +this.getSurname() + " Adli ogrencinin numarasi "+this.studentNumber;
        System.out.println(printed);




    }



}
