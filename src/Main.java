public class Main {
    public static void main(String[] args) {
        int slots = 60;
       if (slots >= 0 && slots < 59){
            System.out.println("В вагоне есть свободные сидячие места.");
        }
       if (slots >= 60 && slots < 102){
           System.out.println("В вагоне есть стоячие места.");
       }
       if (slots >= 102){
           System.out.println("Вагон заполнен");
       }


    }
}