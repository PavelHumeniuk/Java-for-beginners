public class Main {
   public static void main(String[] args) {
      int i = 0;

      while (i < 5){
         System.out.println("Счетчик: " + i);
         // Изменяем значение i, чтобы не было бесконечного цикла
         i++;
      }
   }
}