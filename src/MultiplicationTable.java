/**
 * Populate the 2D array by using addition to add the numbers between the start
 * and stop values that the user entered
 *
 * @author rgill
 * @version 1.0
 */
public class MultiplicationTable extends Table {

    /**
     * Calculates the values for the 2D array using multiplication, using the superclass Array
     *
     * @param start the first number entered
     * @param stop the second number entered
     */
    public MultiplicationTable(int start, int stop) {

        super();

        this.start = start;
        this.stop = stop;

    }

    /**
     * Uses multiplication to calculate the array values
     */
    @Override
    public void table(int start, int stop) {

        //Call the superclass method since we want to override it
        super.table(start, stop);

        // Iterate through the array
        for (int i = 0; i < tableArray.length; ++i) {
            for (int j = 0; j < tableArray.length; j++) {
                // Multiply values
                this.tableArray[i][j] = (float) ((i + this.start) * (j + this.start));

            }
        }
    }


}
