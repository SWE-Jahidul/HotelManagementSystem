package hotelms;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

  public class CustomarDetail {
  private SimpleStringProperty FastName;
  private SimpleStringProperty Lastname;
  private SimpleStringProperty Address;
  private SimpleStringProperty Nationality;
  private SimpleStringProperty City;
  private  SimpleStringProperty Country;
 // private SimpleStringProperty ph;
  private  SimpleStringProperty Mail_number;


    public CustomarDetail(String FastName, String Lastname, String Address, String Nationality, String City, String Country, String Mail_number) {
        
        this.FastName = new SimpleStringProperty(FastName);
        this.Lastname = new SimpleStringProperty(Lastname);
        this.Address = new SimpleStringProperty(Address);
        this.Nationality = new SimpleStringProperty(Nationality);
        this.City = new SimpleStringProperty(City);
        this.Country = new SimpleStringProperty(Country);
      //  this.ph = new SimpleStringProperty(ph);
        this.Mail_number = new SimpleStringProperty(Mail_number);
    
    }
    public String getFastName() {
        return FastName.get();
    }

    public String getLastname() {
        return Lastname.get();
    }

    public String getAddress() {
        return Address.get();
    }

    public String getNationality() {
        return Nationality.get();
    }

    public String getCity() {
        return City.get();
    }

    public String getCountry() {
        return Country.get();
    }

    /*public String getPhone() {
        return phone.get();
    }*/

    public String getMail_number() {
        return Mail_number.get();
    } 
    }   

