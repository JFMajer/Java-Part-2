/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakub
 */
public class Calculator {

    private Reader reader;
    private int stats;

    public Calculator() {
        this.reader = new Reader();
        this.stats = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                this.stats += 1;
                sum();
            } else if (command.equals("difference")) {
                this.stats += 1;
                difference();
            } else if (command.equals("product")) {
                this.stats += 1;
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("sum of the values " + (value1 + value2));
        printEmpty();
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("difference of the values " + (value1 - value2));

        printEmpty();
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("product of the values " + (value1 * value2));
        printEmpty();
    }

    private void statistics() {
        System.out.println("Calculations done " + this.stats);
    }

    private void printEmpty() {
        System.out.println("");
    }

}
