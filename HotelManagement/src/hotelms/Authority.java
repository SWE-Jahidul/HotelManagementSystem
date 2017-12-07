
package hotelms;

import javafx.beans.property.SimpleStringProperty;

public class Authority {
        private SimpleStringProperty First_Name;
        private SimpleStringProperty Last_Name;
        private SimpleStringProperty User_Name;
        private String Password;
        private String Re_Type_pass;
        public String Age;

    public Authority(String First_Name, String Last_Name, String User_Name, String Password, String Re_Type_pass , String Age) {
        this.First_Name = new SimpleStringProperty(First_Name);;
        this.Last_Name = new SimpleStringProperty(Last_Name);
        this.User_Name = new SimpleStringProperty(User_Name);
        this.Password = Password;
        this.Re_Type_pass = Re_Type_pass;
        this.Age=Age;
    }

    public String getFirst_Name() {
        return First_Name.get();
    }

    public String getLast_Name() {
        return Last_Name.get();
    }

    public String getUser_Name() {
        return User_Name.get();
    }

    public String getPassword() {
        return Password;
    }

    public String getRe_Type_pass() {
        return Re_Type_pass;
    }
        
    
}
