package Sort;

/**
 * Created on 2022/7/2  20:28
 *
 * @author yang hong
 */
public class SelectSort {
    public static void main(String[] args) {
        System.out.println("Select Sort");
        int[] a = {7, 4, 1, 9, 12, 19, 3333, 90};
        int temp = 0;
        int minIndex = 0;
        int minvalue = 0;
        int swapCnt = 0;
        int n = a.length;
        for (int i=0; i<n-1; i++){
            minvalue = a[i];
            minIndex = i;
            for (int j=i+1; j<n; j++){
                // 拿到最小值及其index
                if (a[j] < minvalue){
                    minvalue = a[j];
                    minIndex = j;
                }
            }
            // swap i and minIndex
            temp = a[i];
            a[i] = minvalue;
            a[minIndex] = temp;
        }
        System.out.println("swap count: " + swapCnt);
        for (int a1 : a){
            System.out.println(a1);
        }
    }
}
