
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Airplane {
    private int Capacity;
    private String ID;
    private ArrayList<ArrayList<String>> listOfFlights;

    public Airplane(int Capacity, String ID) {
        this.Capacity = Capacity;
        this.ID = ID;
        this.listOfFlights = new ArrayList<ArrayList<String>>();
    }

    public String getID() {
        return ID;
    }

    public int getCapacity() {
        return Capacity;
    }
    
    public void addFlight(String dep, String des) {
        ArrayList<String> tempArray = new ArrayList<String>();
        tempArray.add(dep);
        tempArray.add(des);
        this.listOfFlights.add(tempArray);
    }
    
    public void printFlights() {
        for (ArrayList array : this.listOfFlights) {
            System.out.println(this.ID + " (" + this.Capacity + " ppl)" + " (" + array.get(0) + "-" + array.get(1) + ")");
        }
    }
    
   

    
}
