public class BinaryFind {

    public int search(int[] a, int val) {
        int lenMax = a.length;
        int lenMin = 0;
        int i = (lenMax + lenMin) / 2;

        while (a[i] != val) {
            if (lenMin == lenMax - 1) {
                return -1;
            }
            if (a[i] > val) {
                lenMax = i;
            } else {
                lenMin = i;
            }
            i = (lenMax + lenMin) / 2;
        }

        return i;
    }

}
