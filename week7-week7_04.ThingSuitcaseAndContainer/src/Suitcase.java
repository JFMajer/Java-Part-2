
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
public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;
    private int totalWeight;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight <= this.weightLimit) {
            this.things.add(thing);
            this.totalWeight += thing.getWeight();
        }
    }

    @Override
    public String toString() {
        if (this.things.size() > 1) {
            return (this.things.size() + " things (" + this.totalWeight + " kg)");
        } else if (this.things.size() == 1) {
            return (this.things.size() + " thing (" + this.totalWeight + " kg)");
        } else if (this.things.size() == 0) {
            return ("empty (0 kg)");
        }
        return("k");
    }
    
    public void printThings() {
        for (Thing thing : this.things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (this.things.size() == 0) {
            return null;
        }
        Thing heaviest = this.things.get(0);
        for (Thing thing : this.things) {
            if(thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    
    
    

}
