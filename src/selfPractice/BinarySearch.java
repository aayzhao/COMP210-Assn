package selfPractice;

/**
 *
 * Self-written binary search algorithm
 */
public class BinarySearch {
    public static void main(String[] args){ //for testing
        int[] testArr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(binSearch(testArr1, 20));
    }

    /**
     *
     * Binary search algorithm (iterative approach)
     * @param arr       int array to be searched
     * @param element   int being searched for
     * @return          returns index of the element if found, else -1
     */
    public static int binSearch(int[] arr, int element){
        int lower = 0;
        int upper = arr.length - 1;
        short iterations = 0;

        while (lower <= upper){
            iterations++;
            int middle = (lower + upper) / 2;

            if(arr[middle] == element){
                return middle;
            }
            else if (arr[middle] < element){
                lower = middle + 1;
            }
            else if (arr[middle] > element){
                upper = middle - 1;
            }

        }

        System.out.println("iteration count: " + iterations);

        return -1;
    }
}
