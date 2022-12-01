
import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.Test;
public class TestSelectionSort {

	//private SelectionSort temp1;

@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}

    public TestSelectionSort() {
    }

    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        SelectionSort temp1 = new SelectionSort();
	    int[] sortArr = temp1.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        for (int j = 0; j < sortArr.length; j++)
        {
        	int i = 0;
        	if (Sortedarr[j] == sortArr[j])
        	{
        		i++;
        		if (i == sortArr.length)
        		{
        			assertEquals(i, j);
        		}
        	}
        }
        /** add tests to check for this unit test **/
    }

    @Test
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        SelectionSort temp1 = new SelectionSort();
	    int[] sortArr = temp1.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        for (int j = 0; j < sortArr.length; j++)
        {
        	int i = 0;
        	if (Sortedarr[j] == sortArr[j])
        	{
        		i++;
        		if (i == sortArr.length)
        		{
        			assertEquals(i, j);
        		}
        	}
        }
        /** Test data contains negative values only **/
    }

    @Test
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 0;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;

        SelectionSort temp1 = new SelectionSort();
	    int[] sortArr = temp1.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 10;

        for (int j = 0; j < sortArr.length; j++)
        {
        	int i = 0;
        	if (Sortedarr[j] == sortArr[j])
        	{
        		i++;
        		if (i == sortArr.length)
        		{
        			assertEquals(i, j);
        		}
        	}
        }
        /** Test data contains with both positive, negative and zeros **/
    }

    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 4;
        arr[4] = -2;

        SelectionSort temp1 = new SelectionSort();
	    int[] sortArr = temp1.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 1;
        Sortedarr[3] = 4;
        Sortedarr[4] = 4;

        for (int j = 0; j < sortArr.length; j++)
        {
        	int i = 0;
        	if (Sortedarr[j] == sortArr[j])
        	{
        		i++;
        		if (i == sortArr.length)
        		{
        			assertEquals(i, j);
        		}
        	}
        }
        /** Test data contains duplicates **/
    }
}
