  
public class main { 
 
 public static void main(String[] args) { 
	 Function f1 = new Function(1, 2); 
  Function f2 = new Function(5, 6); 
   
  Function rez; 
  rez = f1.addition(f2); 
   
  System.out.println(rez.getNumerator() + "/" + 
 rez.getDenominator()); 
 } 
} 