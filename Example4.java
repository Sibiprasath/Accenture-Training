import java.util.*;
/*class program_4 {
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            int rat=s.nextInt();
            int unit=s.nextInt();
            int size=s.nextInt();
            int[] arr=new int[size];
            int p=rat*unit;
            int sum=0;
            for(int i=0;i<size;i++)
            {
                arr[i]=s.nextInt();
                sum+=arr[i];
            }
            System.out.print(p-sum);
        }
}
*/
//using method
public class Example4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rat=sc.nextInt();
        int unit= sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }System.out.print(sufficient(rat,unit,arr,n));
    }
    public static int sufficient(int r,int unit,int[] arr,int n)
    {
        if(arr==null)
            return -1;
        int sum=0;
        int count=0;
        int p=r*unit;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            count+=1;
            if(sum>=p)
                break;
        }
        if(sum<p)
            return 0;
        return count;
    }
}