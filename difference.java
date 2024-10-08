import java.util.Scanner;
public class difference {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        differenceofsum(n,m);
    }
    public static void differenceofsum(int n,int m) {
        int sum=0;
        int diff=0;
        for(int i=1;i<=m;i++)
        {
            if(i%4==0)
            {
                diff+=i;
            }
            else{
                sum+=i;
            }
        }
        int total=sum-diff;
        System.out.print(total);
    }
}
