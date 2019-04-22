class RecursiveDigitSum {

    static int superDigit(String n, int k) {
        char[] chars = n.toCharArray();
        long sum = 0;
        for(char c: chars)
            sum += Character.getNumericValue(c);
        sum *= k;
        n = sum+"";
        return n.length() > 1 ? superDigit(n, 1) : Integer.valueOf(n) ;
    }
}
