/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.

 Implement a function that takes a Connect Four board string and decodes it into a representative 2D array.

For an input string of "9_r4_brbrbr_3b2rb_b2r2br_r2b3rb"

The output board would look like:

|_|_|_|_|_|_|_|
|_|_|r|_|_|_|_|
|b|r|b|r|b|r|_|
|b|b|b|r|r|b|_|
|b|r|r|b|b|r|_|
|r|b|b|r|r|r|b|
This function should return an array of character arrays.

The strings should be one of:

r to indicate a red piece
b to indicate a black piece
_ to indicate an empty space


✅ Works drawBoard("9_r4_brbrbr_3b2rb_b2r2br_r2b3rb");

✅ Works drawBoard("6_6r6b6r6b6r6b");

✅ Works drawBoard("6_6r6b6r6b4rbbbbrr2b");

✅ Works drawBoard("4_19r19b")

❌ Too short drawBoard("9_");

❌ Too long drawBoard("9_r4_brbrbr_3b2rb_b2r2br_r2b3rbrb4r");

❌ Invalid characters drawBoard("7_7a7b7c7d7e");

❌ Missing character drawBoard("42");
 */

class ConnectFour {

//   Solution.java:53: error: non-static variable validChars cannot be referenced from a static context
//     validChars = new HashSet<Character>();
//     ^
// Solution.java:54: error: non-static variable validChars cannot be referenced from a static context
//     validChars.add('_');
//     ^
// Solution.java:55: error: non-static variable validChars cannot be referenced from a static context
//     validChars.add('b');
//     ^
// Solution.java:56: error: non-static variable validChars cannot be referenced from a static context
//     validChars.add('r');
//     ^

    public static void main(String[] args) {
        drawBoard("9_r4_brbrbr_3b2rb_b2r2br_r2b3rb");
    }

    private static void drawBoard(String input) {
        char[] inputChar = input.toCharArray();
        char[] result = convertToIntermediateArr(inputChar);
        for(char c: result) {
            System.out.println(c+",");
        }
    }

    private static char[] convertToIntermediateArr(char[] input) {
        String temp="";
        char[] intermediateList = new char[42];
        int count=0;
        for(char character: input) {
            if(count == 42) {
                System.out.println("Too many entries.");
                return null;
            }
            if(Character.isDigit(character)) {
                temp+=character;
            } else if (isValidChar(character)) {
                if(temp.isEmpty()) {
                    intermediateList[count]=character;
                    count++;
                } else if(Integer.valueOf(temp) <= 42-count) {
                    for(int i = 0; i < Integer.valueOf(temp); i++) {
                        intermediateList[count]=character;
                        count++;
                    }
                    temp="";
                }
            } else {
                System.out.println("Invalid character, aborting");
                return null;
            }
        }
        if(count < 41) {
            System.out.println("Too few entries.");
            return null;
        }
        return intermediateList;
    }

    private static boolean isValidChar(char c) {
        return (c == '_' || c=='r' || c=='b') ? true : false;
    }

}
