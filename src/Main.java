public class Main {
    public static void main(String[] args) {
        int age = 18;
        boolean SmallKid = age >= 2 && age <= 6;
        boolean YoungBoy = age >= 7 && age < 18;
        boolean SmartBoy = age >= 18 && age < 24;
        boolean SeriosMan = age >=24;
        if (SmallKid) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (YoungBoy) {
            System.out.printf("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (SmartBoy) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно в университет.");
        } else if (SeriosMan) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }



    }
}