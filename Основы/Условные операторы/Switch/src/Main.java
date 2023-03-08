public class Main {
    public static void main(String[] args) {
        int month = 1;
        String monthString;
        if (month == 1) {
            monthString = "Январь";
        } else if (month == 2) {
            monthString = "Февраль";
        } else {
            monthString = "Неверный номер месяца: " + month;
        }

        System.out.println(monthString);
        System.out.println("Пример со switch-case: ");


        switch (month) {
            case 1:
                monthString = "Январь";
                break; // удали эту строчку или поставь в начале строки `//`
            case 2:
                monthString = "Февраль";
                break; // потом попробуй удалить эту
            default:
                monthString = "Неверный номер месяца: " + month;
        }

        System.out.println(monthString);
    }
}