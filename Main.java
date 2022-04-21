import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,15,46,76,32,45,6,3,33,45,103,14,54,43,76,54,23};
        mergeSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] mergeSort(int[] array){
        int middle=0,start = 0,end = array.length-1;
        
        middle = start + ((end-start)/2);
       int[] left = new int[middle];
       int[] right = new int[array.length-left.length];
       left = Arrays.copyOfRange(array, 0, middle);
       right = Arrays.copyOfRange(array, middle, array.length);
       left = sort(left);
       right = sort(right);
       merge(left,right,array);
       return array;
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int x = 0;
        int y = 0;
        int k = 0;
    
        // iki dizide de eleman varken
        while (x < left.length &&
               y < right.length) {
            if (left[x] < right[y]) {
            result[k] = left[x];
            x++;
            }
            else {
            result[k] = right[y];
            y++;
            }
            k++;
        }
    
        int[] rest;
        int restIndex;
        if (x >= left.length) {
    
            rest = right;
            restIndex = y;
        }
        else {
    
            rest = left;
            restIndex = x;
        }
    
        for (int i=restIndex; i<rest.length; i++) {
            result[k] = rest[i];
            k++;
        }
        }
    
}