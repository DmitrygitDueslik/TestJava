import javax.management.RuntimeErrorException;

public class Function {

	private int numerator;
	private int denominator;
	public Function() {
		numerator=0;
		denominator=1;
	}
	public Function(int _numerator,int _denominator) {
		numerator=_numerator;
		if(_denominator==0) {
			throw new RuntimeException("The denominator is zero");
		}
		denominator=_denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int _numerator) {
		numerator=_numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int _denominator) {
		if(_denominator==0) {
			throw new RuntimeException("The denominator is zero");
			}
		denominator=_denominator;
	}
	public Function addition(Function f) {
		int num,den;
		den=denominator*f.denominator;
		num=numerator*f.denominator+f.numerator*denominator;
	Function result=new Function(num,den);
	return result;
	}
	public Function subtraction(Function f) {
		int num, den;
		den=denominator*f.denominator;
		num=numerator*f.denominator-f.numerator*denominator;
		Function result=new Function(num,den);
				return result;
	}
	public Function multiplication(Function f) { 
		  int num, den; 
		 
		  den = denominator * f.denominator; 
		  num = numerator * f.numerator; 
		 
		  Function result = new Function(num, den); 
		 
		  return result; 
		 } 
		 
		 public Function division(Function f) { 
		  int num, den; 
		 
		  den = denominator * f.numerator; 
		  num = numerator * f.denominator; 
		 
		  Function result = new Function(num, den); 
		 
		  return result; 
		 } 
}
