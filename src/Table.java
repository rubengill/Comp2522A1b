/**
 * Contains methods to create the table based on the size and operation specified
 * by the user, as well as formatting and displaying the results.
 *
 * @author rgill
 * @version 1.0
 */
public abstract class Table {

    /**
     * Holds the start value.
     */
    protected int start;

    /**
     * Holds the stop value.
     */
    protected int stop;

    /**
     * Instance variable for the array. This is declaring the reference variable, not
     * created the 2D array.
     */
    protected float[][] tableArray;

    /**
     * Creates correct table size based on start and stop values
     *
     * @param start the first number
     * @param stop  the second number
     */
    protected void table(int start, int stop) {

        // Int that holds the size of the array
        int size;

        this.start = start;
        this.stop = stop;

        // Subtract second digit from the first and add one to get the size
        size = stop - start + 1;

        // Multiply to get the correct array size
        this.tableArray = new float[size][size];
    }

    /**
     * Format the output
     */
    public void display() {

        // Print column headers, and add spacing
        System.out.print("      ");
        for (int i = start; i <= stop; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();

        // Print separator
        System.out.print("      ");
        for (int i = start; i <= stop; i++) {
            System.out.print("-----");
        }
        System.out.println();

        // Iterate over the 2D array
        for (int i = 0; i < tableArray.length; i++) {

            // Print row header
            System.out.printf("%5d|", start + i);

            // Print array values
            for (int j = 0; j < tableArray[i].length; j++) {
                System.out.printf("%5.0f", tableArray[i][j]);
            }

            //Next line
            System.out.println();
        }

    }
}
