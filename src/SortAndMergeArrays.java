public class SortAndMergeArrays {
    public static void main (String[] args){
        int [] a1 = {1,3,6,8,9};
        int [] a2 = {2,5,15};
        int [] a3 = mergeArrays(a1,a2);
        for(int i=0;i<a3.length;i++)
            System.out.print(a3[i] + " ");
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {
            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }
}
