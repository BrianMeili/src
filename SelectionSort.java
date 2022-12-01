
public class SelectionSort {
//private int temp;
/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * precondition:
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
        	int minIndex = i;
            for (int j = i+1; j < x.length; j++) {
                if (x[j] < x[minIndex]) {
                	minIndex = j;
                }
            } // end of inner for loop

            if (minIndex != i) {
            	int temp = x[i];
                x[i] = x[minIndex];
                x[minIndex] = temp;
            }

        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
