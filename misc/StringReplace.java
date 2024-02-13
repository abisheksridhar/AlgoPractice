import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] input = s.nextLine().toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<input.length;i++){
            if(input[i] == '.'){
                builder.append('!');
            }else if(input[i] == '!'){
                if(i<input.length-1){
                    if(input[i+1]!='!')
                        builder.append("!!");
                    else
                        builder.append('!');
                }else{
                    builder.append("!!");
                }
            }else{
                builder.append(input[i]);
            }
        }
        System.out.println(builder);
        s.close();
    }
}
