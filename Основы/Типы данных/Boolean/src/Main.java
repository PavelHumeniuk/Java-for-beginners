public class Main {
   public static void main(String[] args) {
      boolean value = true;
      System.out.println(value);

      int userAge = 23;
      int allowedAge = 18;
      // Получаем boolean: проверяем возраст больше или равен 18?
      boolean isOk = userAge >= allowedAge;
      System.out.println(isOk);

      // !true == false
      System.out.println(!isOk);
   }
}