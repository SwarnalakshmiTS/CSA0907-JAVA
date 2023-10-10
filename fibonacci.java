import java.util.Scanner;
public class fibonacci{
public static void main(String [] args){
int n=input.nextInt();
int a1=0,a2=1,a3,i;
int a[]=new int[50];
for( i=0;i<10;i++)
{
a[i]=a1;
System.out.print(a[i]+" ");
a3=a1+a2;
a1=a2;
a2=a3;
}
int sum=0;
for( i=0;i<=n*2;i=i+2)
{
sum=sum+a[i];
}
System.out.println("\nSum: "+sum);
}
}
