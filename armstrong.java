import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
        int c=0,temp=n,t=n,sum=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        while(temp>0)
        {
            int rem=temp%10;
            int l=c,p=1;
            while(l>0)
            {
                p=p*rem;
                l--;
            }
            sum=sum+p;
            temp=temp/10;
        }
        System.out.println((sum==t)?"armstrong":"not armstrong");
    }
}
