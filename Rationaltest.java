package java_hw1;
import java.util.Scanner;
public class Rationaltest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first Rational ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Rational a = new Rational (x,y);
		System.out.println("secend Rational ");
		Scanner sc2 = new Scanner(System.in);
		int x2 = sc2.nextInt();
		int y2 = sc2.nextInt();
		Rational b = new Rational (x2,y2);
		
		System.out.print("addition result is ");
		Rational add = Rational.addition(a, b);
		System.out.println(add);
		
		System.out.print("subtraction result is ");
		Rational subtraction = Rational.subtraction(a, b);
		System.out.println(subtraction);
		
		System.out.print("multiplication result is ");
		Rational multiplication = Rational.multiplication(a, b);
		System.out.println(multiplication);
		
		System.out.print("division result is ");
		Rational division = Rational.division(a, b);
		System.out.println(division);
	}
}
