package com.myuniquesite.Exam;
import java.io.*;
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

    public ArrayList<Coffee> getCoffees() {
        return coffees;
    }
    public void deleteStudent(int id){
        coffees.removeIf(s -> s.getId() == id);
        writeToDisk();
    }

    public List<Coffee> searchCoffees(String keyword){
        if(keyword.trim().isEmpty()){
            return coffees;
        }
        return coffees.stream().filter(s ->
        s.getName().toLowerCase().contains(keyword.toLowerCase()) ||
        s.getType().toLowerCase().contains(keyword.toLowerCase()) ||
        s.getOrigin().toLowerCase().contains(keyword.toLowerCase()) ||
        s.getBrewMethod().toLowerCase().contains(keyword.toLowerCase())
    )
    .collect(Collectors.toList());
    }
    public Coffee getCoffees(int id){
        for(Coffee s: coffees){
            if(s.getId() == id)
                return s;
        }
        return null;
    }

    








    public void updateCoffee(int id, Coffee update){
        for(int i = 0; i < coffees.size(); i++){
            if(coffees.get(i).getId() == id){
                coffees.set(i, update);
                writeToDisk();
                break;
            }
        }
    }
    public void addCoffee(Coffee coffee){
        coffees.add(coffee);
        writeToDisk();
    }



    public int getLastId(){
        if(coffees.isEmpty()){
            return 0;
        }
        return coffees.get(coffees.size()-1).getId();
    }

    /**
     * This saves the coffees ArrayList into a CSV file
     */
    public void writeToDisk(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            //write the content of the arraylist into csv
            for(Coffee s : coffees){
                bw.write(s.getId() + ","
                        + s.getName() + ","
                        + s.getType() + ","
                        + s.getOrigin() + ","
                        + s.getBrewMethod() + ","
                );
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println("Uh-oh! Error: " + e.getMessage());
        }
    }

    /**
     * This read the CSV file and loads it to the coffees ArrayList
     */
    public void readFromDisk(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            System.out.println("file not found");
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");

                Coffee s = new Coffee(getLastId(), line, line, line, getLastId(), line, line, false, getLastId(), null, line);
                s.setId(Integer.parseInt(data[0]));;
                s.setName(data[1]);
                s.setType(data[2]);
                s.setOrigin(data[3]);
                s.setBrewMethod(data[4]);
                //add the student the array list
                coffees.add(s);
            }
        }catch(IOException e){
            System.out.println("Uh-oh! Error: " + e.getMessage());
        }
    }







}
