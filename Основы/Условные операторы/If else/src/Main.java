public class Main {
    public static void main(String[] args) {
        int age = 23;
        int allowedAge = 16;

        boolean isAllowedToUse = age > allowedAge;

        // Если разрешено пользоваться, то
        if (isAllowedToUse) {
            System.out.println("Запускаем программу!");
            // Иначе
        } else {
            System.out.println("Выход.");
        }

        System.out.println("-------");
        boolean isAdmin = true;

        // Таким же образом можно сделать сколько угодно ветвлений
        // Просто добавляем if else для каждого нового условия
        if (isAdmin) {
            System.out.println("Запускаем конфигурацию проекта!");
        } else if (isAllowedToUse) {
            System.out.println("Запускаем программу!");
        } else {
            System.out.println("Выход.");
        }
    }
}