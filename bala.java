import java.util.ArrayList;
import java.util.Scanner;
public class bala {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=a;i<=b;i++)
        {
            if(i%11==0){
                continue;
            }
            list.add(i);
            count++;
        }
        System.out.println(list);
        System.out.println(count);

    }
}
