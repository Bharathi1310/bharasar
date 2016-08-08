# bharasar
import java.util.Scanner;


public class ReversalString {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the string : ");
	String s1=in.nextLine();
	StringBuffer s2=new StringBuffer(s1);
	StringBuffer s3=s2.reverse();   
	System.out.println(s3.toString());

	}

}
