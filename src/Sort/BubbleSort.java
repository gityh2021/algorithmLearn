package Sort;

/**
 * Created on 2022/7/2  11:02
 *
 * @author yang hong
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] a = {1, 4, 6, 9, 12, 19, 39, 90};
        int temp = 0;
        int swapCnt = 0;
        boolean isSorted = true;
        int n = a.length;
        for (int i=0; i<n-1; i++){
            isSorted = true;
            for (int j = 0; j<n-i-1; j++){
                if (a[j] > a[j+1]){
                    // swap a[j] and a[j+1]
                    isSorted = false;
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swapCnt += 1;
                }
            }
            if (isSorted){
                break;
            }
        }
        System.out.println("swap count: " + swapCnt);
        for (int a1 : a){
            System.out.println(a1);
        }
    }
}
