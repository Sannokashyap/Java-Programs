import java.util.*;
class ReverseString{
public static void main(String [] args){
String str;
String reverse = " ";
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
str = sc.nextLine();
for(int i=str.length()-1;i>=0;i--){
reverse = reverse + str.charAt(i);

}
System.out.print("Reverse string :"+reverse);

}
}
