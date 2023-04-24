public class Main {
    public static void main(String[] args) {

        int ticket = 10_345; //стоимость билета
        int bonus = 20; //для одной бонусной мили
        int mile = (ticket / bonus); //количество бонусных миль
        System.out.println(mile + " бонусных миль");

    }
}