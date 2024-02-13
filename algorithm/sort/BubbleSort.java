package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] unsortedNumbers = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int temp;
        for(int i =0; i< unsortedNumbers.length;i++){
            boolean swap = false;
            for(int j =0; j<unsortedNumbers.length-i-1;j++ ){
                if(unsortedNumbers[j] > unsortedNumbers[j+1]){
                    temp = unsortedNumbers[j+1];
                    unsortedNumbers[j+1] = unsortedNumbers[j];
                    unsortedNumbers[j] = temp;
                    swap = true;
                }
            }

            if(Boolean.TRUE.equals(swap)){
                break;
            }
        }
        
        Arrays.stream(unsortedNumbers).forEach(System.out::println);
    }
}
