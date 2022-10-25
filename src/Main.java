public class Main {
    public static void main(String[] args) {
        int slots = 102;
       if (slots >= 0 && slots < 30){
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (slots >= 30 && slots < 59) {
           System.out.println("В вагоне есть половина сидячих мест.");
       }
        if (slots >= 60 && slots < 81){
           System.out.println("В вагоне есть стоячие места.");
       } else if (slots >= 81 && slots <100) {
            System.out.println("В вагоне половина стоячих мест.");
        }
       if (slots <= 101){
           System.out.println("Вагон почти заполнен.");
       } else if (slots <= 102){
           System.out.println("Вагон заполнен.");
       }


    }
}