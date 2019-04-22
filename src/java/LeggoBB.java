import java.util.*;

public class LeggoBB {
    public static void main(String[] args) {
        List<Integer> winner = new ArrayList<>(Arrays.asList(8, 12, 42, 46, 56, 12));

        Integer[][] entries = new Integer[][]{
                {10, 16, 31, 32, 50, 22},
                {7, 11, 32, 34, 48, 20},
                {2, 7, 23, 28, 47, 26},
                {5, 6, 37, 38, 55, 12},
                {6, 27, 47, 56, 59, 7},
                {7, 17, 22, 48, 53, 3},
                {8, 18, 27, 63, 66, 26},
                {31, 41, 47, 49, 63, 7},
                {28, 40, 55, 60, 66, 19},
                {27, 52, 54, 58, 66, 16},
                {18, 32, 36, 47, 65, 5},
                {1, 6, 15, 25, 58, 8},
                {19, 28, 37, 42, 62, 5},
                {9, 45, 58, 60, 66, 5},
                {5, 26, 38, 54, 61, 2}
        };

        System.out.format("We have %s entries\n", entries.length);
        System.out.format("We won %s\n", winnings(entries, winner));
    }

    static int winnings(Integer[][] entries, List<Integer> winner) {
        int total = 0;

        Set<Integer> winningSet = new HashSet<>();
        int winningMega = winner.get(5);
        for(int i = 0; i < 5; i++)
            winningSet.add(winner.get(i));

        Set<Integer> tempSet = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(Integer[] entry: entries) {
            tempSet.clear();

            int mega = entry[5];
            for(int i = 0; i < 5; i++)
                tempSet.add(entry[i]);

            intersection.addAll(winningSet);
            intersection.retainAll(tempSet);
            int num = intersection.size();

            if(mega == winningMega) {
                System.out.format("1 mega number, %s others\n", num);
                System.out.println(formatArray(entry));
                switch(num) {
                    case 0:
                        total+=4;
                        break;
                    case 1:
                        total+=4;
                        break;
                    case 2:
                        total+=7;
                        break;
                    case 3:
                        total+=100;
                        break;
                    case 4:
                        total+=50000;
                        break;
                    case 5:
                        total+=1600000000;
                        break;
                }
            } else {
                System.out.format("No mega number, %s others\n", num);
                System.out.println(formatArray(entry));
                switch(num) {
                    case 3:
                        total+=7;
                        break;
                    case 4:
                        total+=100;
                        break;
                    case 5:
                        total+=1000000;
                        break;
                }
            }
        }
        return total;
    }

    public static String formatArray(Integer[] entry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(Integer val: entry) {
            stringBuilder.append(val);
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
