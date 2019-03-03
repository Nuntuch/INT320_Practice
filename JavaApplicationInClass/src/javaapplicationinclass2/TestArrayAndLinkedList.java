/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javafx.print.Collation;

/**
 *
 * @author INT303
 */
public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        for (int i = 0; i < 10; i++) {
            list.add(new Student(i + 1001, (char) (65 + Math.random() * 26) + ""));

        }
        Collections.sort(list);
        list.add(3,new Student(1110, "Somchai"));
        for (Student student : list) {
            System.out.println(student);
        }
        Student st = new Student(1110, "Somchai");
        
        int pos = list.indexOf(st);
        System.out.println("pos = "+pos);
        
    }

    private static class Student implements Comparable<Student>{

        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;

        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + '}';
        }

   
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }

        @Override
        public int compareTo(Student o) {
            System.out.println("this.name :"+this.name +" o.name : "+o.name+" : " + this.name.compareTo(o.name));

            return  this.name.compareTo(o.name);
        }

        
        
    }

}
