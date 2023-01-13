import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Holidays holidays = new Holidays();

        String date = "01/01/2023";
        System.out.println("");
        System.out.println("Na data de " + date);
        System.out.println("temos o feriado de: " + holidays.getHoliday(date));
        System.out.println("");
        System.out.println("Todos os feriados de 2023 são: ");
        System.out.println("");
        List<String> allHolidays = holidays.getAllHolidays();
        for (int i = 0; i < allHolidays.size(); i++){
            System.out.println(allHolidays.get(i));
        }
    }
}