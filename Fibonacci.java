import java.util.*;
class Febonacci{
public static void main(String [] args){
int a = 0;
int b = 1;
int c,n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter n number :");
n = sc.nextInt();
for(int i=0;i<n;i++){
System.out.print(a+" ");
c = a+b;
a = b;
b = c;
}
}

}
