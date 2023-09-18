/**
 * Prints out the multiplication or addition table given the users start and end range and type of table
 *
 * @author rgill
 * @version 1.0
 */
public class ArithmeticTable {

    /**
     * Defines the possibilities for TableType
     */
    private enum TableType {
        ADD, MULT;
    }

    /**
     * Instance of Table type.
     */
    private TableType tableType;

    /**
     * Where the table starts
     */
    private int start;

    /**
     * Where the table ends.
     */
    private int end;

    /**
     * Holds the values for the table in a 2D array.
     */
    private float[][] values;


    /**
     * Checks to make sure the parameters entered are valid
     *
     * @param args arguments user types in
     * @return true if arguments are valid
     */
    public boolean argumentCheck(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, \"*\"");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        if (args[0].charAt(0) == '+') {
            tableType = TableType.ADD;
        } else
            tableType = TableType.MULT;


        int sta;
        int sto;

        try {
            sta = Integer.parseInt(args[1]);
            sto = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, \"*\"");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        if ((sta < 1 || sta > 100) || ((sto < 1 || sto > 100))) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, \"*\"");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        if (sta >= sto) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +,\"*\"");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        start = sta;
        end = sto;
        return true;
    }

    /**
     * Takes in 3 parameters to print out a table
     *
     * @param begin     start value
     * @param finish    end value
     * @param tableType the type of table to be printed
     */
    public void createTable(int begin, int finish, TableType tableType) {
        // Size of the array
        int size;

        // Add or multiply the array column/rows based on if it is ADD or MULT
        switch (tableType) {

            case MULT:
                // Calculate the size of the array using the start and end values given by the user
                this.start = begin;
                size = finish - start + 1;
                this.values = new float[size][size];

                //Iterate over the 2D array
                for (int i = 0; i < size; ++i) {
                    for (int j = 0; j < size; j++) {
                        // Multiply the values for each index in the array based on the row and column
                        this.values[i][j] = (float) ((i + this.start) * (j + this.start));
                    }
                }
                break;

            case ADD:
                // Calcuate the size of the array using the start and end values given by the user
                this.start = begin;
                size = finish - start + 1;
                this.values = new float[size][size];

                //Iterate over the 2D array
                for (int i = 0; i < size; ++i) {
                    for (int j = 0; j < size; ++j) {
                        // Add the values for each index in the array based on the row and column
                        this.values[i][j] = (float) (i + this.start + j + this.start);
                    }
                }
                break;

            // Added default for readability/good coding practice
            default:
                System.out.println("Invalid Table Type");
        }


    }

    /**
     * Prints a table based on the arguments set by the user
     */
    public void printTable() {

        // Iterate over the 2D array
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                // Format the printed array according to the specified format
                System.out.printf("%5.0f", values[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Main method for the file
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create an object, so we can call the methods defined on it
        ArithmeticTable table = new ArithmeticTable();

        if (table.argumentCheck(args)) {
            table.createTable(table.start, table.end, table.tableType);
            table.printTable();
        }
    }
}