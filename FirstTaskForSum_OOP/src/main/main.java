package main;
import Fraction.Fraction;
public class main {
	public static void main(String[] args) {
		Fraction f1=new Fraction();
		Fraction f2=new Fraction();
		Fraction f3;
		f1.numerator=1;
		f1.denominator=2;
		f2.numerator=5;
		f2.denominator=6;
		f3=add(f1,f2);
		System.out.println(f3.numerator+"/"+ f3.denominator);
	}
	public static Fraction add(Fraction fr1, Fraction fr2) {
		int num,den;
		den=fr1.denominator*fr2.denominator;
		num=fr1.numerator*fr2.denominator+fr2.numerator*fr1.denominator;
		Fraction f=new Fraction();
		f.numerator=num;
		f.denominator=den;
		return f;
	}
}
