/**
 * Contains methods to create the table based on the size and operation specified
 * by the user, as well as formatting and displaying the results.
 *
 * @author rgill
 * @version 1.0
 */
public abstract class Table {

    /** Holds the start value. */
    protected int start;

    /** Holds the stop value. */
    protected int stop;

    /** Instance variable for the array. This is declaring the reference variable, not
     * created the 2D array.
     */
    protected float[][] tableArray;

    /**
     * Creates correct table size based on start and stop values
     *
     * @param start the first number
     * @param stop the second number
     */
    protected void table(int start, int stop) {

        // Int that holds the size of the array
        int size;

        this.start = start;
        this.stop = stop;

        size = start - stop + 1;

        this.tableArray = new float[size][size];
    }

    /**
     * Format the output
     */
    public void display() {

    }
}
