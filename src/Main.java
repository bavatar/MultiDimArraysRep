public class Main {
    public static void main(String[] args) {


        // array of gender, major, state, score
        String[][] studentGradebook = new String[100][4];

        studentGradebook[0][0] = "M";
        studentGradebook[0][1] = "Econ";
        studentGradebook[0][2] = "MD";
        studentGradebook[0][3] = "99";

        studentGradebook[1][0] = "F";
        studentGradebook[1][1] = "Mktg";
        studentGradebook[1][2] = "VA";
        studentGradebook[1][3] = "89";

        studentGradebook[2][0] = "F";
        studentGradebook[2][1] = "Biol";
        studentGradebook[2][2] = "NJ";
        studentGradebook[2][3] = "100";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(studentGradebook[i][j]);
            }
        }

        // Create a multidimensional array that prints
        // ten rows numbered 1-10 and five columns numbered 1-5.
        String[][] testArray = new String[10][5];
        // Set the values
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 5; col++) {
                testArray[row][col] = "row=" + row + " col=" + col;
            }
        }

        System.out.println("");

        for (int row = 0; row < 10; row++) {
            String rowStr = "";
            for (int col = 0; col < 5; col++) {
                rowStr += testArray[row][col] + "\t";
                if (col == 4) {
                    System.out.println(rowStr);

                }
            }
        }

        System.out.println("");
//        Create an array to display the multiplication tables for the values 1-12.
//        Your multiplication tables should display as shown below.
//        The interesection of a row value and a column value would be the product of the row * column.
//        System.out.print(i*j);
//        System.out.print('\t');
        testArray = new String[12][12];

        // Intialize
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                //testArray[row][col] = "row=" + row + " col=" + col;
                //rowStr += testArray[row][col] + "\t";

                System.out.print((row + 1)*(col + 1) + "\t");
                if (col == 11)
                {
                    System.out.println();
                }
            }
        }

    }
}
