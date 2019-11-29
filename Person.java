/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class Person {
    private String name;
    private int age;
    private char gender;
    public Person() {
    	setName("unknown");
    	setAge(0);
    	setGender('O');
    }
    public Person (String nm, int a, char g) {
    	setName(nm);
    	setAge(a);
    	setGender(g);
    }
    public Person (String nm) {
    	setName(nm);
    }
    public void setName(String nm){
    	name=nm;
    }
    public String getName(){
    	return name;
    }  
    public void setAge(int a){
        if (a >= 14){
            this.age = a;
        }
        else
            System.out.println("Your age must be at least 14 or above to join the health club");
    }
    public int getAge(){
    	return age;
    }
    public void setGender(char g){
    	if (g=='F' || g=='f' || g=='M' || g=='m' ){
            this.gender = g;
        }
        else 
            System.out.println("Please enter one of the choices ( M / F )");
    }
    public char getGender(){
    	return gender;
    }
    public String toStringg(){
    	return "First Name:"+ getName()+"\nAge:"+getAge()+"\nGender:"+getGender();
    }
}
