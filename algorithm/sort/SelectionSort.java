package algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSort {

    static List<Integer> sort(List<Integer> unSorted){
        int[] unsortedIntegers = unSorted.stream().mapToInt(Integer::intValue).toArray();
        int temp;
        for(int i =0; i< unsortedIntegers.length;i++){
            int pos = i;
            for(int j=i+1; j<unsortedIntegers.length;j++){
                if(unsortedIntegers[j] < unsortedIntegers[pos]){
                    pos = j;
                }
            }
            temp = unsortedIntegers[i];
            unsortedIntegers[i] = unsortedIntegers[pos];
            unsortedIntegers[pos] = temp;
        }

        return Arrays.asList(Arrays.stream(unsortedIntegers).boxed().toArray(Integer[]::new));   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> unsortedNumber = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        sort(unsortedNumber).stream().forEach(System.out::println);
    }
}
