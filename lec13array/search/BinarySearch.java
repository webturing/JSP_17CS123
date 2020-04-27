package lec13array.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 6, 7, 67, 67, 8, 678, 6, 78,};
        Arrays.sort(a);
        int k = 67;
        // int pos = binarySearch2(a, k);
        int pos = Arrays.binarySearch(a, k);
        if (pos < 0) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println(pos);
        }

    }

    private static int binarySearch2(int[] a, int k) {
        int left = 0, right = a.length - 1;
        int pos = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == k) {
                pos = mid;
                break;
            } else if (a[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return pos;
    }

    private static int binarySearch(int[] a, int k) {
        return binarySearch(a, 0, a.length - 1, k);

    }

    private static int binarySearch(int[] a, int left, int right, int k) {
        if (left > right) return -1;
        if (left == right) return a[left] == k ? left : -1;
        int mid = (left + right) / 2;
        if (a[mid] == k) return mid;
        if (a[mid] > k) return binarySearch(a, left, mid - 1, k);
        else return binarySearch(a, mid + 1, right, k);

    }


}
