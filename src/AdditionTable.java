/**
 * Populate the 2D array by using addition to add the numbers between the start
 * and stop values that the user entered
 *
 * @author rgill
 * @version 1.0
 */
public class AdditionTable extends Table {

    /**
     * Calculates the values of the elements in the array
     *
     * @param start the start value
     * @param stop the end value
     */
    public AdditionTable(int start, int stop) {

        // Call the superclass constructor
        super();

        this.start = start;
        this.stop = stop;
    }


    /**
     * Use the stop(begin) and start values set in the superclass to calculate the values
     * of the 2D array.
     *
     * @param start the start value
     * @param stop the end value
     */
    @Override
    public void table(int start, int stop) {

        //Call the superclass method since we want to override it
        super.table(start, stop);

        // Iterate through the array
        for (int i = 0; i < tableArray.length; ++i) {
            for (int j = 0; j < tableArray.length; j++) {
                // Add values
                this.tableArray[i][j] = (float) (i + this.start + j + this.start);

            }
        }
    }


}
