import java.util.*;
class SumOfDigits{
public static void main(String [] args){
int num;
int sum =0 ;
int digit;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
num = sc.nextInt();
while(num != 0){
digit = num%10;
sum = sum + digit;
num = num/10;
}
System.out.println("Sum of Digits:"+sum);

}
}
