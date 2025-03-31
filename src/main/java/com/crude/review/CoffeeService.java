package com.crude.review;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CoffeeService {
    private ArrayList<Coffee> coffees;
    private final String FILE_NAME = "database.csv";

    public CoffeeService() {
        coffees = new ArrayList<>();
        //Read the CSV already just when the constructor is called
        readFromDisk();
    }
try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");

                coffees s = new Student();
                s.setId(Integer.parseInt(data[0]));
                s.setFirstName(data[1]);
                s.setMiddleName(data[2]);
                s.setLastName(data[3]);
                s.setSuffix(data[4]);
                s.setBirthDay2(data[5]);
                s.setGender(data[6]);
                s.setAddress(data[7]);
                s.setLevel(Integer.parseInt(data[8]));
                //add the student the array list
                students.add(s);
            }
        }catch(IOException e){
            System.out.println("Uh-oh! Error: " + e.getMessage());
        }
    }




    public void readFromDisk(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            System.out.println("file not found");
            return;
        }


    public List<Coffee> searchCoffees(String keyword, List<Coffee> Coffee){
        if(keyword.trim().isEmpty()){
            return Coffee;
        }

        return Coffee.stream().filter(s ->
                s.getName().toLowerCase().contains(keyword.toLowerCase())
                || s.getType().toLowerCase().contains(keyword.toLowerCase())
                || s.getSize().toLowerCase().contains(keyword.toLowerCase())
                || s.getRoastLevel().toLowerCase().contains(keyword.toLowerCase())
                || s.getOrigin().toLowerCase().contains(keyword.toLowerCase())
                || s.getSize().toLowerCase().contains(keyword.toLowerCase())
                || s.getBrewMethod().toLowerCase().contains(keyword.toLowerCase())
        ).collect(Collectors.toList());
    }

}
