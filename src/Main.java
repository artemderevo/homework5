public class Main {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int free = 3;
        if (one < two) {
            System.out.println("One меньше, чем two");
        } else if (free > two) {
            System.out.println("Невозможно");
        }
        if (two < free) {
            System.out.println("Two меньше, чем free.");
        } else if (two > free) {
            System.out.println("Невозможною");
        }



    }
}