import java.util.*;

public class ArraySplit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input =  s.nextLine();
        Set<List<Integer>> integers = new HashSet<>();
        int[] inputArray = Arrays.stream(input.replace("{", "").replace("}", "").split(",")).mapToInt(Integer::parseInt).toArray();
        int k =4;
        for(int i=0;i<inputArray.length-(k-2);i++){
            for(int j=i+1;j<inputArray.length;j++){
                for(int n=j+k-1;n<=inputArray.length;n++){
                    List<Integer> temList = new LinkedList<>();
                    temList.add(inputArray[i]);
                    for(int l = 0;l<k-2;l++){
                        temList.add(inputArray[j+l]);
                    }
                    temList.add(n);
                    temList.sort(Comparator.naturalOrder());
                    integers.add(temList);
                }
                
                
            }
        }


        System.out.println(integers.toString() + integers.stream().filter(i-> i.get(i.size()-1) - i.get(0) > 3 ).count());
    }
}
