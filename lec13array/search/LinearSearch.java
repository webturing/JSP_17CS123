package lec13array.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 6, 7, 67, 67, 8, 678, 6, 78,};
        int k = 69;
        int pos = linearSearch(a, k);
        System.out.println(pos);
    }

    private static int linearSearch(int[] a, int k) {
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
