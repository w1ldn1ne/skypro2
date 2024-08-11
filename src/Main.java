public class Main {
    public static void main(String[] args) {
        //Задание первое
        byte age = 27;
        byte ageMajority = 18;
        if (ageMajority <= age){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (ageMajority > age) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задание второе
        byte temp = -4;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Задание третье
        byte speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Четвертое задание
        byte age2 = 7;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 >= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }

        //Пятое задание
        byte age3 = 9;
        if (age3 <= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе с сопровождением");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Шестое задание
        byte people = 59;
        byte capacity = 102;
        byte sitPlace = 60;
        if (people > capacity) {
            System.out.println("В вагоне нет мест");
        }
        else if (people < capacity && people > sitPlace) {
            System.out.println("В вагоне есть только стоячие места");
        }
        else if (people < sitPlace) {
            System.out.println("В вагоне есть и сидячие и стоячие места");
        }

        //Задание седьмое
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else if (three > two && three > one) {
            System.out.println(three);
        }

    }
}