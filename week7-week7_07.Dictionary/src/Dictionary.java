
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Dictionary {
    
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords() {
        int sum = 0;
        for (String word : this.dictionary.keySet()) {
            sum += 1;
        }
        return sum;
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        String test1;
        for (String key : this.dictionary.keySet()) {
            test1 = "";
            test1 += key + " = " + this.dictionary.get(key);
            translationList.add(test1);
            
        }
        return translationList;
    }
    
    
    
    
}
