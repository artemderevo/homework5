public class Main {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 7 && age < 18){
            System.out.println("Ребенок идет в школу");
        } else if (age >=18 && age < 24) {
            System.out.println("Человек  идет в университет");
        }
        else if (age >= 24){
            System.out.println("Человек идет искать работу");
        }

    }
}