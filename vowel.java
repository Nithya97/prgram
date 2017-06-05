import java.io.*;
import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
System.out.println("vowel");
else
System.out.println("consonant");
}}
