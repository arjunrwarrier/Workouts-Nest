import java.util.Scanner;

class LargestInThree{

public static void main(String[] args){

int num1, num2, num3;
Scanner input = new Scanner(System.in);
System.out.print("Enter 3 numbers : ");

num1 = input.nextInt();
num2 = input.nextInt();
num3 = input.nextInt();

if(num1>num2 && num1>num3){
System.out.println(num1+" is greater");
}else if(num2>num3){

System.out.println(num2+" is greater");
}else{
System.out.println(num3+" is greater");
}


}
}