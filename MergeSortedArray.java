import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        mergeSortedArray.merge(num1, num1.length - num2.length , num2, num2.length);
        System.out.println(Arrays.toString(num1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            copy(nums1, nums2);
            return;
        }
        int[] numaux = new int[n + m];
        int i = 0; // iterador para nums2
        int j = 0; // iterador para nums1
        int k = 0; //iterador de numaux
        while (j < m || i < n) {
            
            if (j == m) {
                numaux[k++] = nums2[i++];
                continue;
            }
            if (i == n) {
                numaux[k++] = nums1[j++];
                continue;
            }
                numaux[k++] = (nums1[j] < nums2[i]) ? nums1[j++] : nums2[i++];
            /*
            if (nums1[j] < nums2[i]) {
                numaux[k] = nums1[j];
                j++;
                k++;
                continue;
            }
            if (nums1[j] >= nums2[i]) {
                numaux[k] = nums2[i];
                i++;
                k++;
                continue;
            }
            */
        }
        copy(nums1, numaux);
        //nums1 = Arrays.copyOf(numaux, n+m);
    }

    public void copy(int[] target, int[] original) {
        for (int i = 0 ; i< original.length ; ++i) {
            target[i] = original[i];
        }
    }
}