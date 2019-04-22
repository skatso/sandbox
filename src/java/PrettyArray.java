import java.util.ArrayList;

public class PrettyArray {
    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int size = A*2-1;
        int val;
        Integer[][] arr = new Integer[size][size];
        for(int i = 0; i < A; i++) {
            for(int j = 0; j < i; j++) {
                val = Math.abs(A-j);
                arr[i][j] = val;
                arr[i][size-1-j] = val;
                arr[size-1-i][j] = val;
                arr[size-1-i][size-1-j] = val;
            }
            for(int j = i; j < A; j++) {
                val = Math.abs(A-i);
                arr[i][j] = val;
                arr[i][size-1-j] = val;
                arr[size-1-i][j] = val;
                arr[size-1-i][size-1-j] = val;
            }
        }
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < size; j++)
                temp.add(arr[i][j]);
            results.add(temp);
        }
        return results;
    }

    public static void main(String[] args) {
        ArrayList results = prettyPrint(4);
        System.out.println(results);
    }
}
