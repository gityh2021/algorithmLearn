package Sort;

/**
 * Created on 2022/7/2  11:38
 *
 * @author yang hong
 */
public class InsertSort {
    public static void main(String[] args) {
        System.out.println("Insert Sort");
        int[] a = {7, 4, 555, 9, 12, 19, 3333, 90};
        int n = a.length;
        int ai = 0;
        // 保持j一直是i-1；
       for (int i=1, j=i-1; i<n; j=i++){
           ai = a[i];
           while(ai < a[j]){
               a[j+1] = a[j];
               if (j-- <= 0){
                   break;
               }
           }
            a[j+1] = ai;
       }
        for (int a1 : a){
            System.out.println(a1);
        }
    }
}
