import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String input = s.nextLine();
        List<Character> characters = input.chars().filter(c -> Character.isAlphabetic(c)).mapToObj(e->(char)e).sorted().collect(Collectors.toList());
        List<Character> numbers = input.chars().filter(c->Character.isDigit(c)).mapToObj(e->(char)e).sorted().collect(Collectors.toList());
        char[] inpArray = input.toCharArray();
        for(int i=0,pos =0,numPos=0;i<input.length();i++){
            if(Character.isAlphabetic(inpArray[i])){
                inpArray[i] = characters.get(pos);
                pos++;
            }else if(Character.isDigit(inpArray[i])){
                inpArray[i] =numbers.get(numPos);
                numPos++;
            }
        }

        String output = new String(inpArray);
        System.out.println(output);
        s.close();
    }

}
