package Enum;

import java.util.EnumSet;

public enum Courses {
    // declaring constants of enum types
    JVPRL("Java Programming Language","2022"),
    CHTP("C# Programming Language","2023"),
    INDSC("Into Web Design Concept","2024"),
    ANRESP("Angular for Responsive Web","2012"),
    PVFAI("Python For Artificial Intelligence","2019"),
    REFUIUX("React For Ui/UX design","2023");

    //instance fields
    private final String Coursetitle;
    private final String  Courseyear;

    //enum constructor
    Courses(String title, String year){

            Coursetitle=title;
            Courseyear=year;
    }
    public String getTitle(){
        return Coursetitle;
    }
    public String getCourseyear(){
        return Courseyear;
    }

    public static void main(String []args){
        System.out.println("Printing All courses...");
        for(Courses tobeprinted1: Courses.values()){
            System.out.printf("%-10S%-45s%s\n",tobeprinted1,
                    tobeprinted1.getTitle(),tobeprinted1.getCourseyear());
            System.out.println("Display a range of Courses:\n");
            //print first four courses
            for(Courses tobeprinted: EnumSet.range(Courses.CHTP,
                    Courses.ANRESP)){
                System.out.printf("%-10S%-45S%S\n",tobeprinted,tobeprinted,
                        tobeprinted.getCourseyear());

            }
        }
    }
}
