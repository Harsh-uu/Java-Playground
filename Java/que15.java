public class que15 {
    static int at_index(int[] a, int b) throws ArrayIndexOutOfBoundsException {
        if (b >= a.length || b < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return a[b];
    }
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 3, 5};
        System.out.println(at_index(array, 2));
    }
}

