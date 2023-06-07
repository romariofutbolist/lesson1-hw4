public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int t = 6;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int year = 2;
        if (year < 2) {
            System.out.println("Если возраст человека равен " + year + ", то ему пора спать");
        }
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад");
        }
        if (year > 6 && year < 19) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        }
        if (year > 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в университет");
        }
        if (year > 24 && year <= 60) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить на работу");
        }
        if (year > 60) {
            System.out.println("Если возраст человека равен " + year + ", то ему можно отдохнуть");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 40;
        int capacity = 102;
        int seatPlace = 60;
        if (passengers > capacity) {
            System.out.println("Если в вагон хотят попасть " + passengers + " пассажиров, то вагон полностью забит, мест нет");
        }
        if (passengers <= capacity && passengers > seatPlace) {
            System.out.println("Если в вагон хотят попасть " + passengers + " пассажиров, то в вагоне будут только стоячие места");
        } else {
            System.out.println("Если в вагон хотят попасть " + passengers + " пассажиров, то в вагоне будут сидячие и стоячие места");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 6;
        int two = 8;
        int three = 5;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}


