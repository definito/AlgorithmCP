import java.util.Scanner;

public class series {
    public static void main(String[] args)
    {
        Integer  total=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        int x = 0;
        Integer[] y=new Integer[10000];
        int temp=0;
        int p=0;
        for(int i = 1; i<=n; i++) {
            x = x+i;
            System.out.println(i+":"+" ");
            for (int j=1;j<=x;j++){
                temp=temp+1;
                y[temp]=temp;
                System.out.print(y[temp]+" ");
            }
            System.out.println("\n");
            for(int k = 1; k<=i; k++) {
                int sum =1;
                for(int l = 1; l<=k; l++) {
                       p=p+1;
                    sum = y[p]* sum ;
                }
                total=total+sum;
                System.out.println(sum+"\n");
            }
        }
        System.out.println("The total of "+n+" digit sum is: " + total);
    }
}
