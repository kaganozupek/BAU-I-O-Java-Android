package com.company;

import java.util.ArrayList;

public class Main {


    public static int faktoriyel (int sayi)
    {
       int sonuc = 1;

        for(int i = 1;i <= sayi;i++)
        {

            sonuc = sonuc * i;


        }





        return sonuc;
    }

    public static void ickiIcebilirmi(int yas)
    {
        boolean icebilirMi = yas >= 21;

        if(icebilirMi)
        {
            System.out.println("Cihan Icki Icebilir");

        }else
        {
            System.out.println("Cihan Otele Don");
        }



    }


    public static void main(String[] args) {
	// write your code here

       /* int integer2 = 10123;
        float floatDegisken = 3.1f;
        double dd = 3.6;
        String string = "Bu bir stringtir";
        int [] intArray = new int[10];
        ArrayList<Double> arrayList = new ArrayList();
        System.out.println("Integer degerimiz : " + integer2);
        */

        
        int verilenYas = 21;

        //ickiIcebilirmi(verilenYas);

        int c = faktoriyel(5);

        System.out.println(c);

        Student s = new Student();
        s.setName("Cihan");
        s.setSurname("Nalbant");
        s.setAge(21);
        s.studentNumber = 123456;

        s.printStudentInfo();



    }
}
