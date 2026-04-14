package src2;

public class Test2 {
	private int par1;
	private int par2;
	
	public Test2() {
		this(0,1);
	}
	public Test2(int _par1,int _par2) {
		par1=_par1;
		par2=_par2;
	}
	
	public int getPar1() {
		return par1;
	}
	public void setPar1(int _par1) {
		par1=_par1;
		
	}
	
	public int getPar2() {
		return par2;
	}
	public void setPar2(int _par2) {
		par2=_par2;
	}
}
