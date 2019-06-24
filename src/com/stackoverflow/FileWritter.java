//See StackOverFlow_question_56660027.java regarding information about this question.
package com.stackoverflow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileWritter {
    List<String> loadlist2() {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/ashishraghavan/Production/StackOverFlow/src/com/stackoverflow/DairyNames.txt"));
            String mystring;
            while ((mystring = in.readLine()) != null) {
                list.add(mystring);
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
        return list;
    }
}
