import java.io.*;
import java.util.*;
class large
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a<b)
{int d=b;
if(d<c)
System.out.println(c);
else
System.out.println(d);
}else{
int e=a;
if(e<c)
System.out.println(c);
else
System.out.println(e);
}
}}
