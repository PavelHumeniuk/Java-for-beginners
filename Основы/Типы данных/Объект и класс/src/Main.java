public class Main {
   public static void main(String[] args) {
      // Создаем объект типа Pizza c именем pepperoni
      // new означает, что мы создаем новый объект вызывая его конструктор
      // В конструктор мы передали характеристики нашей пиццы: имя и ее вес.
      Pizza pepperoni = new Pizza("Пепперони", 600);

      // Напечатаем в консоли характеристики пиццы
      System.out.println(pepperoni.name);
      System.out.println(pepperoni.weight);

      // Попробуй ниже создать пиццу Маргарита с весом 450 грамм



      // Вывести в консоль ее характеристики

   }

   // Опишем класс пицца. Для простоты он будет состоять из имени и веса
   // Можно добавить еще сколько угодно характеристик внутри класса,
   // но для начала ограничимся таким примером
   public static class Pizza {
      String name;
      int weight;

      // Это называется конструктор, своеобразная инструкция, по которой мы создадим объект
      public Pizza(String name,  int weight) {
         this.name = name;
         this.weight = weight;
      }
   }
}
