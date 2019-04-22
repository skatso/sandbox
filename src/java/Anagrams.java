import java.util.Arrays;
import java.util.HashMap;

class Anagrams {
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> repeatedString = new HashMap<>();
        String temp;
        char[] charArr;
        int anagramsCount = 0;
        int val;

        //Find all substrings
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j <= s.length(); j++) {
                temp = s.substring(i, j);
                if(temp.isEmpty())
                    continue;
                //Sort the characters of the string
                charArr = temp.toCharArray();
                Arrays.sort(charArr);
                temp = new String(charArr);

                //Keep track of occurrences of each sorted substring
                if(!repeatedString.containsKey(temp))
                    repeatedString.put(temp, 1);
                else {
                    val = repeatedString.get(temp);
                    repeatedString.put(temp, val+1);
                }
            }
        }

        for(Integer value: repeatedString.values()) {
            if(value > 1)
                anagramsCount+= specialFactorial(value);
        }
        return anagramsCount;
    }

    private static int specialFactorial(int val) {
        //Use the permutation math !n/(r!*!(n-r)),
        //  where n is the number of occurrences,
        //  and r is the number of possible combinations
        //  (in this case, only comparing 2 strings together
        //Since r is always known, we can reduce the above
        //  expression to (n*(n-1))/2
        if(val <= 2)
            return 1;
        return (val*(val-1))/2;
    }
}
