package FilterExample;

public class ReverseString {

	public static void main(String[] args) {
String text="Bhubaneswar";
String reverse="";
for(int i=text.length()-1;i>=0;i--) {
	reverse=reverse+text.charAt(i);}
	System.out.println(reverse);
}
	}
