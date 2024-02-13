import java.util.Arrays;
import java.util.Scanner;

public class ConcatanateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a1 = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a2 = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int pointer = 0;
        int temp;
        for(int i=0;i<a1.length + a2.length;i++){
            if(a1[i] > a2[pointer]){
                temp = a1[i];
                a1[i] = a2[pointer];
                

            }
        }

    }
}
