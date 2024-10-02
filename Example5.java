import java.util.*;
public class Example5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=20)
        {
            int n1=0;
            int n2=1;
            int n3=0;
            for(int i=0;i<n;i++)
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }System.out.print(n3);
        }
        else
            System.out.print("Wrong Infrastructure");
    }
}