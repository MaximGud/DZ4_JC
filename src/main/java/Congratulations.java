import java.time.LocalDate;

public class Congratulations {
  
  public static void congratulate (Customer[] customers){
    LocalDate today= LocalDate.now (); 
    int month = today.getMonthValue();
    int dayOfMonth = today.getDayOfMonth();

    if (month == 3 && dayOfMonth == 8){
      for (Customer customer : customers) {
        if (customer.getGender() == Gender.FEMALE) {
           System.out.println("Поздравляем"+" "+ customer.getFIO()+" "+ "с праздником "+ Holidays.EIGHTMARTH.getLabel() );
          
        }
      }
    }
    else if (month == 2 && dayOfMonth == 23){
      for (Customer customer : customers) {
        if (customer.getGender() == Gender.MALE) {
           System.out.println("Поздравляем"+" "+ customer.getFIO()+" "+ "с праздником "+ Holidays.TWENTYTHIRDFEBRUARY.getLabel() );
       }
      }
    }
    else if (month == 12 && dayOfMonth == 31){
      for (Customer customer : customers) {
        
           System.out.println("Поздравляем"+" "+ customer.getFIO()+" "+ "с Новым Годом");
        
      }
    }
    else System.out.println("Сегодня "+ Holidays.NOHOLIDAY.getLabel());
  }
}