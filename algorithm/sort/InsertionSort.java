package algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InsertionSort {

    private static List<Integer> sort(List<Integer> unsortedList){
        int [] unsorted = unsortedList.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<unsorted.length-1;i++){
            if(unsorted[i] > unsorted[i+1]){
                int temp = unsorted[i];
                unsorted[i] = unsorted[i+1];
                unsorted[i+1] = temp;
                for(int j = i;j >= 1;j--){
                        if(unsorted[j-1] > unsorted[j]){
                            temp = unsorted[j];
                            unsorted[j] = unsorted[j-1];
                            unsorted[j-1] = temp;
                        }
                    }
            }
            
        }
        return Arrays.stream(unsorted).boxed().toList();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> unsortedArray = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        sort(unsortedArray).stream().forEach(System.out::println);
    }
}
