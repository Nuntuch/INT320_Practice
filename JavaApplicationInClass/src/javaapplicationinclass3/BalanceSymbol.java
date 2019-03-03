/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author INT303
 */
public class BalanceSymbol {

    public static String check(String fileName) throws FileNotFoundException {

        File f = new File(fileName);

        if (!f.exists()) {
//            throws new FileNotFoundExecption(fileName);
            throw new FileNotFoundException(fileName);
        }
        Scanner sc = new Scanner(f);
            LinkedList<String> stack = new LinkedList<String>();
        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "{}[]()<>", true);

//        System.out.println(line);

            while (stk.hasMoreElements()) {
                String token = stk.nextToken();
                if (isBalanceSymbol(token)) {
                    if (isOpeingSymbol(token)) {
//                        System.out.println("push(" + token + ") to Stack");
                        stack.push(token);
                    } else {
//                        System.out.println("pop() and check");
                        String top = stack.peek();
                        if (top == null) {
                            return "Missing opening aymbol";
                        }
                        if (getSymbolValue(top) != getSymbolValue(token)) {
                            return "Unbalanced";

                        }
                        stack.pop();

                    }
                }

//                System.out.println(token);
            }

        }
        if(!stack.isEmpty()){
        return "Missing closing symbol";
        }

//        return null;
        return "Balanced";
    }

    public static int getSymbolValue(String symbol) {

        switch (symbol) {
            case "{":
            case "}":
                return 1;
            case "[":
            case "]":
                return 2;
            case "(":
            case ")":
                return 4;
            case "<":
            case ">":
                return 8;

        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(check("Deck.java"));
        System.out.println(check("JavaApplicationInClass1.java"));
    }

    private static boolean isBalanceSymbol(String symbol) {

        switch (symbol) {
            case "{":;
            case "}":;
            case "[":;
            case "]":;
            case "(":;
            case ")":;
            case "<":;
            case ">":;
                return true;

        }

        return false;

    }

    private static boolean isOpeingSymbol(String symbol) {
        switch (symbol) {
            case "{":;
            case "[":;
            case "(":;
            case "<":;

                return true;

        }

        return false;
    }

}
