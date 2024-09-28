import java.util.*;
class Example2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0,res=0;
        for(int i=0;i<str.length();i++)
        {
            char[] c=str.toCharArray();
            if(c[i]=='u')
            {
                count+=1;
                if(count==0){
                    res+=1;
                }
            }
            else{
                count-=1;
            }
        }
        System.out.print(res);
    }
}