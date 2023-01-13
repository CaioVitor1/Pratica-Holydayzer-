import java.util.ArrayList;
import java.util.List;

public class Holidays {
    private String[] holidays = { "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal" };
    private String[] day = {"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };
    
    public String getHoliday(String date) {
        for (int i = 0; i < day.length; i++) {
            if (day[i] == date) {
                return holidays[i];
            }
        }
        return "Sem feriados nesse dia!";
    }

    public List<String> getAllHolidays(){
        List<String> allHolidays = new ArrayList<>();
        for (int i = 0; i < day.length; i++){
            allHolidays.add("data: " + day[i] + " = " + holidays[i]);
        }

        return allHolidays;
    }
}