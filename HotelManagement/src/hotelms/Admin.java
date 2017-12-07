/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;

public class Admin extends Authority implements IbookedHistory{
    
    public Admin(String First_Name, String Last_Name, String User_Name, String Password, String Re_Type_pass , String Age) {
        super(First_Name, Last_Name, User_Name, Password, Re_Type_pass ,Age);
    }

    
    public  void AddRoom()
    {
        //Codeing here 
    }
    public void UpdateRoom()
    {
        //Codeing here 
    }
    public void DeletRoom()
    {
        //codeing here
    }
    
    public void ShowRoom()
    {
     //codeing here
        
    }

    @Override
    public void cheak_book_history() {
        
        System.out.println("This is check book history method");
        
    }
    
    
}
