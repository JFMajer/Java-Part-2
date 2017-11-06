
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            }
            System.out.println("");
        }
    }
    
    public void add() {
        System.out.println("In Finish: ");
        String word_to_add = this.reader.nextLine();
        System.out.println("Translation: ");
        String trans_to_add = this.reader.nextLine();
        this.dictionary.add(word_to_add, trans_to_add);
    }
    
    public void translate() {
        System.out.println("Give a word: ");
        String word_to_translate = this.reader.nextLine();
        String translation = this.dictionary.translate(word_to_translate);
        System.out.println("Translation: " + translation);
    }
    
    
    
}
