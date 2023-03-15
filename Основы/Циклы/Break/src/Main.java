public class Main {
   public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {
         if (i == 3) {
            System.out.println("Остановочка :" + i);
            break;
         }
         System.out.println("Счетчик: " + i);
      }
   }
}