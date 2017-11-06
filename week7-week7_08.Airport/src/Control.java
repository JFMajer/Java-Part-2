
import java.util.ArrayList;
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
public class Control {

    private Scanner reader;
    private ArrayList<Airplane> planes;

    public Control() {
        this.reader = new Scanner(System.in);
        String input = "1\n" + "AY-123\n"
                + "109\n" + "x\n"
                + "1\n" + "x\n";
        String input2 = "1\n" + "Kuba\n" + "110\n" + "x\n" + "2\n" + "x\n";
        //this.reader = new Scanner(input);
        this.planes = new ArrayList<Airplane>();
    }

    public void beginningScreen() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
    }

    public void firstPanel() {
        while (true) {
            printMenu1();
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                System.out.println("");
                beginningScreen2();
                secondPanel();
                break;
            } else if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            }
        }
    }

    public void beginningScreen2() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
    }

    public void secondPanel() {
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                return;
            } else if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printPlaneInfo();
            }
        }

    }

    public void start() {
        beginningScreen();
        firstPanel();
    }

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCapacity = this.reader.nextInt();
        Airplane airplane = new Airplane(planeCapacity, planeID);
        planes.add(airplane);
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = this.reader.nextLine();
        for (Airplane plane : planes) {
            if (planeID.equals(plane.getID())) {
                plane.addFlight(departureCode, destinationCode);
            }
        }
    }

    public void printPlanes() {
        for (Airplane plane : planes) {
            System.out.println(plane.getID() + " (" + plane.getCapacity() + " ppl)");
        }
    }

    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        for (Airplane plane : planes) {
            if (planeID.equals(plane.getID())) {
                System.out.println(plane.getID() + " (" + plane.getCapacity() + " ppl)");
                System.out.println(" ");
            }
        }
    }

    public void printFlights() {
        for (Airplane plane : planes) {
            plane.printFlights();
        }
        System.out.println("");
    }

    public void printMenu1() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

}
