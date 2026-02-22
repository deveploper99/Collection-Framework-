package org.rtxrassel;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rassel");
        students.add("Karim");
        students.add("Rahim");

        System.out.println("Total Student: " + students.size());

        for(String s : students){
            System.out.println(s);
        }
    }
}
