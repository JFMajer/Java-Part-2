
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
public class Container {
    
    private int weightLimit;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return(this.suitcases.size() + " suitcases  (" + this.totalWeight + " kg)");
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
    
    
    
    
    
}
