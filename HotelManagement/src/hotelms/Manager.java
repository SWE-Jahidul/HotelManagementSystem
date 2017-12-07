/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;

/**
 *
 * @author Jahidul Islam
 */
public class Manager extends Authority implements Iroomdetails,IbookedHistory{
    
    public Manager(String First_Name, String Last_Name, String User_Name, String Password, String Re_Type_pass,String Age) {
        super(First_Name, Last_Name, User_Name, Password, Re_Type_pass,Age);
    }
    
    
    
    void CalculateMoney()
    {
        //Codeing here
    }
   
    @Override
    public void RoomDetais() {
       //codeing here
    }

    @Override
    public void cheak_book_history() {

     //Codeing Here

    }
    
}
