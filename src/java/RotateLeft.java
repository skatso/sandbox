public class RotateLeft {
    public static void main(String[] args) {
        rotateLeft(5, 4, new int[]{1, 2, 3, 4, 5});
    }

    static void rotateLeft(int n, int k, int[] arr) {
        if (arr.length == 1)
            System.out.print(arr[0]);
        else if (arr.length > 1) {
            int amountToRotate = k % n;
            int[] temp = new int[n*2];
            for(int i=0; i<arr.length; i++) {
                temp[i] = arr[i];
                temp[i+n] = arr[i];
            }
            for(int i=amountToRotate; i<amountToRotate+n; i++)
                System.out.print(temp[i]+" ");
        }
    }
}
