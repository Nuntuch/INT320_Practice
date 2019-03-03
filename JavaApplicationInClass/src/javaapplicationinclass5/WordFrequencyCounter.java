/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinclass5;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class WordFrequencyCounter {

    private Map<String, Word> words;

    public WordFrequencyCounter() {
        words = new HashMap();

    }

    public void clear() {
        words.clear();
    }

    public void processFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
//            StringTokenizer stk = new StringTokenizer(line, " .;:/-()",true);
            StringTokenizer stk = new StringTokenizer(line, " .;:/-()\\,1234567890;:");
            while (stk.hasMoreElements()) {
                String word = stk.nextToken().toLowerCase();
                if (words.get(word) == null) {
                    words.put(word, new Word(word));
                } else {
                    words.get(word).increment();
                }

            }

        }

    }

    public List<Word> getResult() {
//    words.entrySet();
//    words.keySet();
//    words.values();
        return new ArrayList(words.values());
    }

    public String toString() {
        StringBuilder stb = new StringBuilder(100 * 20);
        List<Word> list = getResult();
        Collections.sort(list);
        for (Word word : list) {
            stb.append(String.format("%-15s:%3d\n", word.getWord(),word.getCount()));
        }
        return stb.toString();
    }

}
