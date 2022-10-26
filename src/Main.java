public class Main {
    public static void main(String[] args) {
        int age = 5;
        boolean SmallKid = age <= 5;
        boolean SmallBoy = age >= 6 && age < 14;
        boolean YoungBoy = age >= 14;
        if (SmallKid) {
            System.out.println("Слишком маленький возраст для аттракционов.");
        } else if (SmallBoy) {
            System.out.println("Можно кататься на аттракционах, но тольок в сопровождении взрослого.");
        } if (YoungBoy) {
            System.out.println("Можно кататься на аттракционах.");
        }



    }
}