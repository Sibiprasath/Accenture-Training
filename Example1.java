import java.util.*;
public class Example1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 1;
        while(first<=num){
            first = first*2;
        }
        first = first/2;
        int out=((num-first)*2)+1;
        System.out.print(out);
    }
}