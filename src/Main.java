public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    public static void task2 () {
        System.out.println();
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature<5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int speed = 4;
        if (speed>60){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        int age = 25;
        boolean preSchool = age >= 2 && age <=6;
        boolean school = age >= 7 && age <=18;
        boolean university = age > 18 && age <24;
        boolean job = age > 24;
        if (preSchool){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        } else if (school){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        } else if (university){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
        } else if (job){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу.");
        }
    }

}