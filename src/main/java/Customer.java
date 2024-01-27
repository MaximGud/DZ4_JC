import lombok.Data;

import java.time.LocalDate;
@Data
public class Customer {
    private String FIO;
    private LocalDate dateOfBirth;
    private String phone;
    private Gender gender;

    public Customer(String FIO, LocalDate dateOfBirth, String phone, Gender gender ) {
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
    }

    //Геттеры и сеттеры для всех полей класса
    public String getFIO() {
        return FIO;
      }
     
      public void setFIO(String FIO) {
        this.FIO = FIO;
      }
    
      public LocalDate getDateOfBirth() {
        return dateOfBirth;
      }
      
      public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
      }
     
      public String getPhone() {
        return phone;
      }
      
      public void setPhone(String phone) {
        this.phone = phone;
      }
      
      public Gender getGender() {
        return gender;
      }
      
      public void setGender(Gender gender) {
        this.gender = gender;
      }
}
