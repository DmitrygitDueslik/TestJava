package src3;

	public class DecimalCounter {
	    private int value;
		private final int MIN = 0; 
	    private final int MAX = 9; 

	    public DecimalCounter() {
	        this.value = MIN;
	    }

	    
	    public DecimalCounter(int initialValue) {
	        if (initialValue < MIN || initialValue > MAX) {
	            System.out.println("Ошибка: Значение " + initialValue + " вне диапазона [" + MIN + ".." + MAX + "]. Установлено " + MIN);
	            this.value = MIN;
	        } else {
	            this.value = initialValue;
	        }
	    }

	    public void increment() {
	        value++;
	        if (value > MAX) {
	            value = MIN;
	        }
	    }

	    public void decrement() {
	        value--;
	        if (value < MIN) {
	            value = MAX;
	        }
	    }

	    public int getValue() {
	        return value;
	    }
}
