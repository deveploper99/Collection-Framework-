package org.rtxrassel;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayList<String> student = new ArrayList<>();
        student.add("Rassel Hassan");
        student.add("Siam ahmed");
        student.add("taslim");
        student.add(1,"Karimul Islam"); // add at index
        student.add(0,"Siam");
        student.set(0,"======="); // replace
        student.removeFirst(); //1st object remove
        student.removeLast(); //last object delete

        student.clear();
        if(student.contains("Siam ahmed")){
            System.out.println("Yes");
        }else{                              // contains diye khuja
            System.out.println("no");

        }

        System.out.println("ArrayList er Size:"+student.size());
        System.out.println("ArrayList is Emty: " +student.isEmpty());





        for(String s:student){
            System.out.println(s);
        }


    }
}
