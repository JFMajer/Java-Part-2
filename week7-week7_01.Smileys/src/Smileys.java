
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        int numOfSmileys = 0;
        String smiley = ":)";
        if (length % 2 == 0) {
            numOfSmileys = length ;
            if (numOfSmileys < 5) {
                numOfSmileys = 5;
            }
        } else if (length % 2 != 0) {
            numOfSmileys = length + 1;
        }
        for (int i = numOfSmileys; i > 0; i--) {
            System.out.print(smiley);
        }
        System.out.println("");
        if (length % 2 != 0) {
            System.out.println(smiley + " " + characterString + "  " + smiley);
        } else {
            System.out.println(smiley + " " + characterString + " " + smiley);
        }
        for (int i = numOfSmileys; i > 0; i--) {
            System.out.print(smiley);
        }
        System.out.println("");

    }

}
