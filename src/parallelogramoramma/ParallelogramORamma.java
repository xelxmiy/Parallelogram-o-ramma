package parallelogramoramma;

/* imports */
import javax.swing.JOptionPane;

/*
 * ParallelogramORamma - Makes a parallelogram given a hight and width, and symbol
 * 
 * @author Adam Belski
 * @version 1.0.0
 * @since 25-Feb-2023
 */
public class ParallelogramORamma {

    /* declair vars */
    static int heightInput;
    static int widthInput;
    static char symbolInput;

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //intro message
        JOptionPane.showMessageDialog(null,
                "Welcome to Parallelogram-O-Ramma!\n"
                + "This program takes in a Height, Width and Symbol\n "
                + "and returns a Parallelogram with those dimensions!",
                "Parallelogram-O-Ramma",
                JOptionPane.INFORMATION_MESSAGE);

        //height input
        heightInput = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Enter the Height of the Parallelogram",
                "Parallelogram-O-Ramma",
                JOptionPane.INFORMATION_MESSAGE));

        //width input
        widthInput = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Enter the Width of the Parallelogram",
                "Parallelogram-O-Ramma",
                JOptionPane.INFORMATION_MESSAGE));

        //symbol input 
        symbolInput = JOptionPane.showInputDialog(
                null, "Enter the character to make the\n"
                + "Parallelogram out of",
                "Parallelogram-O-Ramma",
                JOptionPane.INFORMATION_MESSAGE).charAt(0);

        //output the string
        System.out.println(makeParallelogram(heightInput, widthInput, symbolInput));
        
        //go agains screen
        String[] options = {"Again", "Quit"};
        
        int choice = JOptionPane.showOptionDialog(null,
                "Thank you for using Parallelogram-O-Ramma\n\n",
                "Parallelogram-O-Ramma",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null, options, null);

        if (choice == JOptionPane.YES_OPTION) {
            main(args);

        } else {
            System.exit(0);
        }
    }

    /*
    * i really wanted to separate these into their own methods but i saw that
    * there's an assignment in unit 2 that is literally doing that so i have 
    * to hold off 
     */
    /**
     * Makes a Parallelogram with the given parameters
     *
     * @param height the height of the Parallelogram (NOT THE SIDE LENGTH)
     * @param width the width of the Parallelogram
     * @param symbol the symbol of which the Parallelogram is made
     */
    static String makeParallelogram(int height, int width, char symbol) {

        final int INITIAL_HIGHT = height;
        final int OFFSET = 2;
        final int LAST_LINE = 1;

        String shape = "";
        for (int n = height; n > 0; n--) {
            //for each
            for (int i = 0; i < n; i++) {
                shape += " ";
            }

            if (n == INITIAL_HIGHT) {

                for (int j = 0; j < width; j++) {
                    shape += symbol;
                }

                shape += "\n";
            } else if (n == LAST_LINE) {

                for (int k = 0; k < width; k++) {
                    shape += symbol;
                }
            } else {
                shape += symbol;

                for (int j = 0; j < width - OFFSET; j++) {
                    shape += " ";
                }

                shape += symbol + "\n";
            }
        }
        return shape;
    }
}
