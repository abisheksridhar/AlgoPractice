import java.util.Scanner;

class Amstrong {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
    int sum = input.chars().reduce(0,(j,i)-> j + (int)Math.pow(Character.getNumericValue(i),3));
      System.out.println(sum);
    s.close();
  }
}
