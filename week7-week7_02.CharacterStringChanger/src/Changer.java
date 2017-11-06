
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
public class Changer {

    private ArrayList<Change> listOfChanges;

    public Changer() {
        this.listOfChanges = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.listOfChanges.add(change);
    }
    
    public String change(String characterString) {
        String toReturn = characterString;
        for (Change someChange : this.listOfChanges) {
           toReturn = someChange.change(toReturn);
        }
        return toReturn;
    }

}
