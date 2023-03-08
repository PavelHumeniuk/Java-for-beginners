public class Main {
   public static void main(String[] args) {
      // Возьмем пример из предыдущего урока...
      int age = 23;
      int allowedAge = 16;
      boolean isAllowedToUse = age > allowedAge;

      String message;
      if (isAllowedToUse) {
         message = "Запускаем программу!";
      } else {
         message = "Выход.";
      }
      System.out.println(message);
      System.out.println("Пример с Elvis: ");

      // ... и перепишем:
      // сначала идет значение, если условие верно (true), затем если ложь (false)
      String elvisMessage = isAllowedToUse ? "Запускаем программу!" :  "Выход.";
      System.out.println(elvisMessage);
   }
}