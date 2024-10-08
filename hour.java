import java.util.Scanner;
public class hour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int total=n1*n2;
            if(total>24){
                int val=total-24;
                //System.out.println(val);
                if(total>12) {
                    int op=val-12;
                    System.out.println(op);
                }
            }
        else{
            System.out.println(total);
        }
    }
}
