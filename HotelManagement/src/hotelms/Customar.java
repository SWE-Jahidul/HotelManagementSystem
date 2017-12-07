/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;

import javafx.beans.property.SimpleStringProperty;

public class Customar {
   
 private SimpleStringProperty c_first_name;
 private SimpleStringProperty c_last_name;
 private SimpleStringProperty c_user_name;
 private String c_password;
 private String c_re_type_password;

    public Customar(String c_first_name, String c_last_name, String c_user_name, String c_password, String c_re_type_password) {
        this.c_first_name = new SimpleStringProperty(c_first_name);
        this.c_last_name = new SimpleStringProperty(c_last_name);
        this.c_user_name = new SimpleStringProperty(c_user_name);
        this.c_password = c_password;
        this.c_re_type_password = c_re_type_password;
    }

    public String getC_first_name() {
        return c_first_name.get();
    }

    public String getC_last_name() {
        return c_last_name.get();
    }

    public String getC_user_name() {
        return c_user_name.get();
    }

    public String getC_password() {
        return c_password;
    }

    public String getC_re_type_password() {
        return c_re_type_password;
    }
 
    
    
}
