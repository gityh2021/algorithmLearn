package BinarySearch;

public class BinarySort {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7, 8, 8, 8};
        int target = 4;
        int left = 0;
        int right = a.length - 1;
        int mid = 0;
        // 基本二分
        System.out.println("-------------------------基本二分-------------------------");
        while(left <= right){
            mid = left + (right - left) / 2;
            if (a[mid] == target){
                System.out.println(mid);
                break;
            } else if (a[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        // 变体1 查到第一个值为target的元素
        System.out.println("-------------------------查到第一个值为target的元素-------------------------");
        left = 0;
        while(left <= right){
            mid = left + (right - left) / 2;
            if (a[mid] == target){
                if (mid == 0 || a[mid - 1] != target){
                    System.out.println(mid);
                    break;
                }
                right = mid - 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        // 变体1 查到最后一个值为target的元素
        System.out.println("-------------------------查到最后一个值为target的元素-------------------------");
        left = 0;
        right = a.length - 1;
        while(left <= right){
            mid = left + (right - left) / 2;
            if (a[mid] == target){
                if (mid == a.length - 1 || a[mid + 1] != target){
                    System.out.println(mid);
                    break;
                }
                left = mid + 1;
            } else if (a[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        // 变体3 查找第一个大于等于给定值的元素
        System.out.println("-------------------------查找第一个大于等于给定值的元素-------------------------");
        left = 0;
        right = a.length - 1;
        while (left <= right){
            mid = left + (right - left) / 2;
            if (a[mid] >= target){
                if (mid == 0 || a[mid - 1] < target){
                    System.out.println(mid);
                    break;
                }else{
                    right = mid - 1;
                }
            }else{
                left = mid + 1;
            }
        }

        System.out.println("-------------------------查找最后一个小于等于给定值的元素-------------------------");
        left = 0;
        right = a.length - 1;
        while (left <= right){
            mid = left + (right - left) / 2;
            if (a[mid] <= target){
                if (mid == a.length - 1 || a[mid + 1] > target){
                    System.out.println(mid);
                    break;
                }else {
                    left = mid + 1;
                }
            }else {
                right = mid - 1;
            }
        }
    }
}
