import java.util.Scanner;
class Maximumthree
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,max;
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
System.out.println("enter c value");
c=sc.nextInt();
if(a>b && a>c)
{
max=a;
}
 else if(b>c && b>a)
{
max=b;
}
else 
{
max=c;
}
System.out.printf("the maximum number beteween " +a+" and " +b+ " and " +c+ " is:"+max);
}
}
