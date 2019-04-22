public class MinEditDistance {
    static int minEditDistance(String s1, String s2) {
        /*
        Create bottom-up table based on characters in both strings,
            with extra space for an empty string val
         */
        s1 = " " + s1.toLowerCase();
        s2 = " " + s2.toLowerCase();
        int[][] table = new int[s1.length()][s2.length()];

        /*
        Prepopulate table with known values (we need to make edits to
            go from an "empty" string on one side of the table to the other complete string,
            and vice versa
         */
        for(int i = 0; i < s1.length(); i++)
            table[i][0] = i;
        for(int i = 0; i < s2.length(); i++)
            table[0][i] = i;

        int valToIncrementCellBy;
        for(int i = 1; i < s1.length(); i++) {
            for(int j = 1; j < s2.length(); j++) {
                /*
                Determine if we add one "change operation" by checking if the characters for each string
                    in the cell are the same.
                 */
                valToIncrementCellBy = s1.charAt(i) != s2.charAt(j) ? 1 : 0;
                table[i][j] = valToIncrementCellBy +
                        Math.min(   table[i-1][j-1], Math.min(
                                    table[i-1][j], table[i][j-1]));
            }
        }

        //Return bottom right corner
        return table[s1.length()-1][s2.length()-1];
    }
}
