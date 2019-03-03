/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author INT303
 */
public class TestHashSet {

    public static void main(String[] args) {
////        Set<String> set = new HashSet(16, (float) 0.75);
//        Set<String> set = new HashSet();
//        set.add("cat");
//        set.add("Dog");
//        set.add("Birt");
//        set.add("Fish");
//        set.add("Duck");
//
//        System.out.println("Cat".hashCode());
//
//        String x = new String("Cat");
//        System.out.println("Cat".hashCode());
//
////            System.out.println("set has a Dog?" + set.contains("Dog"));
//        System.out.println("set has a Dog?" + (set.contains("Dog") ? "Yes" : "No"));
//        testHasCode();
//        TestHashFn.main(args);
//        int h = 18;
//        int hash = h ^ (h >>> 16);
//        System.out.println(hash & 15);
//        System.out.println(hash & 12);

    }

    public static void testHasCode() {
        Set<BankAccount> baSet = new HashSet();
        baSet.add(new BankAccount(1001, "Somchai", 500));
        baSet.add(new BankAccount(1002, "Somsak", 500));
        baSet.add(new BankAccount(1003, "Somcsri", 500));
        baSet.add(new BankAccount(1004, "Somrak", 500));
        baSet.add(new BankAccount(1005, "Somchart", 500));
        baSet.add(new BankAccount(1006, "Somckid", 500));

        BankAccount ba1 = new BankAccount(1002, "Somsak", 500);
        BankAccount ba2 = new BankAccount(1005, "Somchart", 500);
        BankAccount baa = new BankAccount(1002, "Somsak", 500);

        System.out.println(baSet.contains(ba1));
        System.out.println(baSet.contains(ba2));

        System.out.println(ba1.hashCode());
        System.out.println(baa.hashCode());

    }
}

class BankAccount {

    private int accountId;
    private String name;
    private double balance;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.accountId;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
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
        final BankAccount other = (BankAccount) obj;
        if (this.accountId != other.accountId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class TestHashFn {

    public static void main(String[] args) {
        String x[] = {"This", "Ant", "Dog", "Cat", "Bird", "Horse", "Monkey", "Tiger", "Fish", "Camel", "Bear", "Lion"};
        Map<String, String> animal = new HashMap();
        for (String a : x) {
            System.out.println(a + " : " + a.hashCode() + "  -->  " + hash(a.hashCode()
            ));
            animal.put(a, a);
        }

    }

    static int hash(int h) {
        int hash = h ^ (h >>> 16);
        return hash & 15;
    }

}
