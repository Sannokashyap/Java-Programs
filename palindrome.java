class palindrome{
public static void main(String [] args){
int n = 121;
int rev=0;
int rem;
int original = n;

while(n>0){
rem = n%10;
rev = rev*10+rem;
n = n/10;
}

if(original == rev){
System.out.println("yes,It is Palindrome");
}
else{
System.out.println("It is not Palindrome");
}

}
}









