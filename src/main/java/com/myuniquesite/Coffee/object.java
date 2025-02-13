package com.myuniquesite.Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class object {
    public static void main(String[] args) {
        //data structure vs data types
        //data structure- array(fixed data), array list(flexible) :
        //data types-bit, byte,  int double float long
        Integer[] nums = {1,2,3};
        ArrayList<Integer> numslist = new ArrayList<>();
        numslist.add(1);
        numslist.add(2);
        numslist.add(3);
        numslist.add(4);
        numslist.add(5);

        System.out.println(numslist.get(0));
        //Integer[] numsAgain = Arrays.asList(numslist);

        List<Integer> listAgain = Arrays.asList(nums);
        System.out.println(listAgain.get(0));

        for (int i = 0; i < numslist.size(); i++){
            System.out.println("press f");
        }

        for (Integer x: numslist){
            System.out.println(x);
        }

        numslist.forEach((Integer x)->{
            System.out.println("Lambda " + x);

        });

        Student[] students = new Student[5];
        //ArrayList<Students> studList = new ArrayList<>;
        //
        var studList = new ArrayList<>();
        studList.add()
    }
}
