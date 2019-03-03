/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT303
 */
public class TestSetAndMap {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet(new StudentComparatorByName());
        students.add(new Student(10001, "Somchai", 3.59));
        students.add(new Student(10002, "Somchart", 3.15));
        students.add(new Student(10003, "Somkiat", 2.00));
        students.add(new Student(10004, "Somsak", 2.50));
        students.add(new Student(10005, "Somsri", 1.98));

//        System.out.println(students);
        students.forEach(System.out::println);
//        students.forEach((x) -> System.out.println(x));

    }
}

class StudentComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return - s1.getName().compareTo(s2.getName());
    }
//
//    @Override
//    public int compareTo(Student o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double gpax;

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpax() {
        return gpax;
    }

    public void setGpax(double gpax) {
        this.gpax = gpax;
    }

    public Student(int id, String name, double gpax) {
        this.id = id;
        this.name = name;
        this.gpax = gpax;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpax=" + gpax + '}';
    }

}
