package src3;

public class main {
    public static void main(String[] args) {

        DecimalCounter counter1 = new DecimalCounter();
        System.out.println("1. Создан счетчик по умолчанию: " + counter1.getValue());

        counter1.increment();
        counter1.increment();
        System.out.println("2. После двух увеличений: " + counter1.getValue());

        DecimalCounter counter2 = new DecimalCounter(7);
        System.out.println("\n3. Создан счетчик со значением 7: " + counter2.getValue());

        counter2.increment(); // стало 8
        counter2.increment(); // стало 9
        counter2.increment(); // стало 0 (цикл)
        System.out.println("4. После трех увеличений (переход 9->0): " + counter2.getValue());

        counter2.decrement(); // стало 9
        System.out.println("5. После одного уменьшения (переход 0->9): " + counter2.getValue());

        System.out.println("\n6. Попытка создать счетчик со значением 15:");
        DecimalCounter counter3 = new DecimalCounter(15);
        System.out.println("   Результат: " + counter3.getValue());
    }
}