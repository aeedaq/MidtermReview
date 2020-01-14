/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author aeeda
 */
public class Student {

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     *
     * @return
     */
   
    public String toString()
    {
        return ("name="+name+" age="+age+" id="+id);
    }
}
