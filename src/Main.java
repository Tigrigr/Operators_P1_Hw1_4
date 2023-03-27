public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 34;
        if (age>=18){
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
}