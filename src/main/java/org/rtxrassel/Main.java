package org.rtxrassel;
import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> student = new ArrayList<>();
//        student.add("Rassel Hassan");
//        student.add("Siam ahmed");
//        student.add("taslim");
//        student.add(1,"Karimul Islam"); // add at index
//        student.add(0,"Siam");
//        student.set(0,"======="); // replace
//        student.removeFirst(); //1st object remove
//        student.removeLast(); //last object delete
//
//        student.clear();
//        if(student.contains("Siam ahmed")){
//            System.out.println("Yes");
//        }else{                              // contains diye khuja
//            System.out.println("no");
//
//        }
//
//        System.out.println("ArrayList er Size:"+student.size());
//        System.out.println("ArrayList is Emty: " +student.isEmpty());
//
//
//
//
//
//        for(String s:student){
//            System.out.println(s);
//        }


        //arraylistIterator();

        iterator();


    }


    private static void iterator(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Rassel Hassan");
        names.add("Hassan");
        names.add("Akbar Khan");
        names.add("monika");
        names.add("liya");

//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            if (s.equals("Hassan")){
//                iterator.remove();
//            }
//
//        }
        names.removeIf(s -> s.equals("monika"));

        for(String a : names){
            System.out.println(a);
        }
    }



    private static void arraylistIterator() {
        ArrayList<String> names = new ArrayList<>();
            names.add("Rassel Hassan");
            names.add("Rakib");
            names.add("Akramul");

            for (int i=0; i<names.size();i++){

                if(names.get(i).equalsIgnoreCase("Rakib")){
                    break;
                }

                System.out.println(names.get(i).toLowerCase());

            }
        }
    }




