package org.example;

public class Person {
    String  firstname;
    String  lastName;
    int age;
    String genius;
    double size;
    int kg;


    public Person(String  firstname,String  lastName,int age){
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String  firstname,String  lastName,int age,String genius,double size, int kg){
        this(firstname,lastName,age);
        this.genius=genius;
        this.size=size;
        this.kg=kg;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public Boolean isTeen(){
        return age>=13 && age<=19 ? true : false ;
    }
}