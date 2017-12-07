/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelms;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
public class FXMLDocumentController implements Initializable {
    @FXML
    private JFXRadioButton male,female; 
    @FXML
    private Button Admin;
    @FXML
    private AnchorPane id1,Authoritypan, wellcomead,roomdetail,ChoiceYourroompan,adid2,superior,delux,Connecting,creatnewAccountadmin;
    @FXML
    private Label un,pass;
    @FXML
    private PasswordField passf,AdminUserpassword2;
    @FXML
    private JFXButton adlog,AddRoom,adexit,wellcomadminexit,addingRoomExit,adid2login,ShowRoomDetai,
            adid2loginexit,vewroomdetail,choiceroomexit,Superior,superiorExit,deluxx,Deluxexit
            ,connectingexit,creatnewAccount1a,CreatenewExit,admincreatnewaccclogin,AdminReset,
            Admin1,Manager,Employee,AddRoombyAdmin,TableExit,delet_room_exit,Deletroom_by_customar;
    @FXML
    private JFXTextField AdminFirstName, AdminLastname,AdminUserName,AdminPassWord,AdminResetPassword
            ,adminBackto,unf;
   // AddRoom by AdminButton
   
    @FXML
    void Deletroom_by_customar_button(ActionEvent event)
    {   
       delet_room_acpane.setVisible(true);
       roomdetail.setVisible(false);
    }
    //ShowRoomDetailButton
     
    
    @FXML
    private TableView<Addroom> show_room_detail_table;

    @FXML
    private TableColumn<Addroom, String> room_no_colam;

    @FXML
    private TableColumn<Addroom, String> room_rate_colam;

    @FXML
    private TableColumn<Addroom, String> bed_type_colom;

    @FXML
    private TableColumn<Addroom, String> city_colam;

    @FXML
    private TableColumn<Addroom, String> room_type_colom;
    int addroom=1;
    ObservableList <Addroom> ShowRoomDetailList = FXCollections.observableArrayList();
     Addroom add;
   @FXML
      void ShowRoomDetailButton(ActionEvent event)
    {   
        if(addroom ==1)
        {
            if(RoomNotext.getText().length()<=0 || RoomRate.getText().length()<=0)
            { 
            JOptionPane.showMessageDialog(null,"Plase Enter Your Full Details..!!"); 
            } 
        
        else   
        {    
            ShowRoomDetailList.add(new Addroom(RoomNotext.getText(),RoomRate.getText(),BedType.getValue(),City.getValue(),BedType.getValue()));
            room_no_colam.setCellValueFactory(new PropertyValueFactory<>("RoomNO"));
            room_rate_colam.setCellValueFactory(new PropertyValueFactory<>("RoomRate"));
            bed_type_colom.setCellValueFactory(new PropertyValueFactory<>("BedType"));
            city_colam.setCellValueFactory(new PropertyValueFactory<>("BedType"));
            room_type_colom.setCellValueFactory(new PropertyValueFactory<>("RoomType"));
            show_room_detail_table.setItems(ShowRoomDetailList);
            clear(RoomNotext,RoomRate);
            room_detail_ancore_pan.setVisible(true);
            roomdetail.setVisible(false);
        }
      
    }
}

      ObservableList<String>roomlist = FXCollections.observableArrayList();
   int room =1;
   
    @FXML
    void AddRoombyAdminButton(ActionEvent event)
    {
       //Adding object in arraylist 
      if(room == 1)
      {
          if(RoomNotext.getText().length()<=0)
          {
              JOptionPane.showMessageDialog(null,"Plase Enter Room Nuber !!!");
          }
      else 
      {
          
          roomlist.add(RoomNotext.getText());
          JOptionPane.showMessageDialog(null,"Room Added Successfully!!!");
      } 
      }
    }
     //Manager Button
    int ManagerAug;
    @FXML
    void ManagerButton(ActionEvent event)
    {
       ManagerAug =1;
       adid2.setVisible(true);
       Authoritypan.setVisible(false);
    }
//Admin1 Button
    int AdminAug ;
    @FXML
    void Admin1Button(ActionEvent event)
    {   
       AdminAug =1;
       adid2.setVisible(true);
       Authoritypan.setVisible(false);
    }
    //Employee Button
    int EmplyeeAug; 
    @FXML
    void EmployeeButton(ActionEvent event)
    {
         EmplyeeAug=1;
         adid2.setVisible(true);
         Authoritypan.setVisible(false);
    }
    @FXML
    void adminBacktoButton(ActionEvent event)
    {
        adid2.setVisible(true);
        id1.setVisible(false);
    }
    @FXML
    void AdminResetButton(ActionEvent event) {
       AdminFirstName.setText("");
       AdminLastname.setText("");
       AdminUserName.setText("");
       AdminPassWord.setText("");
       AdminResetPassword.setText(""); 
    }
    //admincreatnewacccloginButton
    @FXML
    private TableView<Authority> AdminTable;
    @FXML
    private TableColumn<Authority, String> AdminTableFirstName,AdminTableLatName,AdminTableUserName;
    Admin ad;
    Manager ma;
    Employee em;
    
    //Create new Account for Autority 
    ObservableList <Authority> AuthortyCreateList = FXCollections.observableArrayList(); 
    @FXML
    void admincreatnewacccloginButton(ActionEvent event) {    
    if(AdminAug ==1)
       {
           if (AdminFirstName.getText().length()<=0 ||AdminLastname.getText().length()<=0 || AdminUserName.getText().length()<=0
                ||AdminPassWord.getText().length()<=0 || AdminResetPassword.getText().length()<=0 )
        { 
            JOptionPane.showMessageDialog(null,"Plase Enter Your Full Details..!!"); 
        }
          else if(AdminPassWord.getText().equals(AdminResetPassword.getText())){
              AuthortyCreateList.add( new Admin( AdminFirstName.getText(), AdminLastname.getText(),
              AdminUserName.getText(),AdminPassWord.getText(),AdminResetPassword.getText(),Age.getValue()));
              AdminTableFirstName.setCellValueFactory(new PropertyValueFactory<>("First_Name"));    
              AdminTableLatName.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));    
              AdminTableUserName.setCellValueFactory(new PropertyValueFactory<>("User_Name"));    
              AdminTable.setItems(AuthortyCreateList);
              AdminTableAnPane.setVisible(true);
              clear(AdminFirstName,AdminLastname,AdminUserName,AdminPassWord,AdminResetPassword);
              JOptionPane.showMessageDialog(null, "build succesful");
         }
           else
           {
               JOptionPane.showMessageDialog(null, "retype pass and Pass word can't match");
           }
       }
       else if(ManagerAug ==1)
       {
           if (AdminFirstName.getText().length()<=0 ||AdminLastname.getText().length()<=0 || AdminUserName.getText().length()<=0
                ||AdminPassWord.getText().length()<=0 || AdminResetPassword.getText().length()<=0 )
        { 
         JOptionPane.showMessageDialog(null,"Plase Enter Your Full Details..!!");
         }
          else if(AdminPassWord.getText().equals(AdminResetPassword.getText())){ 
              AuthortyCreateList.add( new Admin(
              AdminFirstName.getText(), AdminLastname.getText(),
              AdminUserName.getText(),AdminPassWord.getText(),
              AdminResetPassword.getText(),Age.getValue()));
              JOptionPane.showMessageDialog(null, "build succesful");
              
              //=====
              AdminTableFirstName.setCellValueFactory(new PropertyValueFactory<>("First_Name"));    
              AdminTableLatName.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));    
              AdminTableUserName.setCellValueFactory(new PropertyValueFactory<>("User_Name"));    
             //Bug this codes
              AdminTable.setItems(AuthortyCreateList);
              AdminTableAnPane.setVisible(true);
              //=====
              clear(AdminFirstName,AdminLastname,AdminUserName,AdminPassWord,AdminResetPassword);
         }
           else
           {
               JOptionPane.showMessageDialog(null, "retype pass and Pass word can't match");
           }
       }
        else if(EmplyeeAug ==1)
        {
           if (AdminFirstName.getText().length()<=0 ||AdminLastname.getText().length()<=0 || AdminUserName.getText().length()<=0
                ||AdminPassWord.getText().length()<=0 || AdminResetPassword.getText().length()<=0)
        { 
            JOptionPane.showMessageDialog(null,"Plase Enter Your Full Details..!!");
        }
          else if(AdminPassWord.getText().equals(AdminResetPassword.getText())){
              AuthortyCreateList.add( new Admin(
              AdminFirstName.getText(), AdminLastname.getText(),
              AdminUserName.getText(),AdminPassWord.getText(),
              AdminResetPassword.getText(),Age.getValue()));
              JOptionPane.showMessageDialog(null, "build succesful");
              AdminTableFirstName.setCellValueFactory(new PropertyValueFactory<>("First_Name"));    
              AdminTableLatName.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));    
              AdminTableUserName.setCellValueFactory(new PropertyValueFactory<>("User_Name"));    
              AdminTable.setItems(AuthortyCreateList);
              AdminTableAnPane.setVisible(true);
              clear(AdminFirstName,AdminLastname,AdminUserName,AdminPassWord,AdminResetPassword);
         }
           else
           {
               JOptionPane.showMessageDialog(null, "retype pass and Pass word can't match");
           }
        }
    }
    @FXML
    void exitofAuthorityButton(ActionEvent event)
            {
               Authoritypan.setVisible(false);
            }
    @FXML
    void CreatenewExitButton(ActionEvent event) {
        creatnewAccountadmin.setVisible(false);  
    }
    @FXML
    void creatnewAccount1aButton(ActionEvent event) {
        creatnewAccountadmin.setVisible(true);
        adid2.setVisible(false); 
    }
    @FXML
    void ConnectingButton(ActionEvent event) {
        Connecting.setVisible(true);
 }
    @FXML
    void connectingexitButton(ActionEvent event) {
       Connecting.setVisible(false);
    }
    @FXML
    void deluxButton(ActionEvent event) {
       delux.setVisible(true);
    }
    @FXML
    void deluxexitbutton(ActionEvent event) {
       delux.setVisible(false);  
    }  
    @FXML
    void superiorExitButton(ActionEvent event) { 
        superior.setVisible(false);
    }
    @FXML
    void SuperiorButton(ActionEvent event) {  
       superior.setVisible(true);  
    }
    @FXML
    void choiceroomexitButton(ActionEvent event) {
     ChoiceYourroompan.setVisible(false);
    } 
    @FXML
    void adid2loginexitbutton(ActionEvent event) {
      adid2.setVisible(false);
    }
    @FXML
    void adid2loginButton(ActionEvent event) {
         id1.setVisible(true);
         adid2.setVisible(false);
         CustomarTypePan.setVisible(false);
         }
    @FXML
    void addingRoomExitButton(ActionEvent event) {
       roomdetail.setVisible(false);  
       
    }
    @FXML
    void wellcomadminexitbutton(ActionEvent event) {
       wellcomead.setVisible(false);
       
    }
    @FXML       
    void admainButton(ActionEvent event) {
       Authoritypan.setVisible(true);
       adid2.setVisible(false);
       cusld3.setVisible(false);
       id2.setVisible(false);
       wellcomead.setVisible(false);
       roomdetail.setVisible(false);
       customardetail.setVisible(false);
       regsuccessfully.setVisible(false);
       AdminTableAnPane.setVisible(false);
       CustomarTypePan.setVisible(false);
       CustomarTableAncorePane.setVisible(false);
       
     }
    @FXML
    void TableExitButton(ActionEvent event)
    {
         AdminTableAnPane.setVisible(false);
    }
     @FXML
    void adlogIn(ActionEvent event) {
        {
            CustomarTypePan.setVisible(false);
           /// Coding changing
            if(AdminUserNmae2.getText().isEmpty() ||AdminUserpassword2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter your username and password first !!");
            }else if(!AdminUserNmae2.getText().isEmpty() ||!AdminUserpassword2.getText().isEmpty()){
               
                String username = AdminUserNmae2.getText();
                String password = AdminUserpassword2.getText();
                
                if(checkLogin(username,password)){
                     wellcomead.setVisible(true);
                     clear(AdminUserNmae2,AdminUserpassword2);
                     id1.setVisible(false);
                }else{
                   JOptionPane.showMessageDialog(null, "Your Username or Password not Correct!");
                   //=====================================
                   clear(AdminUserNmae2,AdminUserpassword2);
                }
            }
     
        }
   }
    
    public boolean checkLogin(String u, String p){
         for(Authority lst : AuthortyCreateList){
            
             if(u.equals(lst.getUser_Name()) && p.equals(lst.getPassword())){
                       return true;
                   } 
           } 
         return false;
    }
    
    // Room Information Details...
    @FXML
    void addroom(ActionEvent event) {
        CustomarTypePan.setVisible(false);
       roomdetail.setVisible(true);
       wellcomead.setVisible(false);
       id1.setVisible(false);
       id2.setVisible(false);
    }
    
    //delet_room_exit_button
    
    @FXML
    void delet_room_exit_button(ActionEvent event) {
      delet_room_acpane.setVisible(false);
    }
    
    @FXML
    void adexitbutton(ActionEvent event) {
       id1.setVisible(false);
       creatnewAccountadmin.setVisible(true);
    }
    @FXML
    void vewroomdetailbutton(ActionEvent event) {
        CustomarTypePan.setVisible(false);
       ChoiceYourroompan.setVisible(true);
       roomdetail.setVisible(false);
    }
    @FXML
    private Button Customar;
    @FXML
    private Label customarln,cun,cpass,cunf;
    @FXML
    private JFXButton cex,clogin,ref,customerexit,CustomarDetailsExit,CustomarReset,CustomarTypeExit,cheak_cliend_details_of_customar,
            cusld3login,cusld3exit,regsuccessfullyexit,Creatanewaccout,LocalCustomar1,ForeignCustomar,customar_table_exit,
           resetofdetail,view_room_detail_exit ,berofcustomarnewacc,CustomarTableExit,loginofcustomarnewaccount,exitofAuthority,delet_room,Customarback;
    @FXML
    private AnchorPane customardetail,CustomarTypePan,regsuccessfully,cusld3,customarnewaccountacpane,
            id2,customartableacpane,AdminTableAnPane,CustomarTableAncorePane,delet_room_acpane,room_detail_ancore_pan;
    @FXML 
    private JFXTextField AdminUserNmae2,NameofCustomar,LastNameOfCustomar,AdressOfCustomar,NationalityOfCustomar
            ,CityOfCustomar,CountryOfCustomar,PhoneNuberOfCustomar,mailOfCustomar,cpassf,RoomNotext,RoomRate,
            CustomarFirstName,CustomarLastName,CustomarUserName,CustomarPassword,room_no_text,CustomarRetypePassword;
  
    @FXML
    void view_room_detail_exit_button(ActionEvent event)
            {
               room_detail_ancore_pan.setVisible(false);
            }
     @FXML
    void customar_table_exit_buttion(ActionEvent event)
            {
               customartableacpane.setVisible(false);
            }
     @FXML
    void delet_room_button1(ActionEvent event)
            {
               
            }
    
       @FXML
    void CustomarTableExitButton(ActionEvent event)
            {
              CustomarTableAncorePane.setVisible(false);
            }
    
    @FXML
    void cheak_cliend_details_of_customar_button(ActionEvent event)
            {
                CustomarTypePan.setVisible(false);
             customartableacpane.setVisible(true); 
            }
    //Reset Button of Customar
      @FXML
      void resetofdetailButton(ActionEvent event) { 
      NameofCustomar.setText("");
      LastNameOfCustomar.setText("");
      AdressOfCustomar.setText("");
      NationalityOfCustomar.setText("");
      CityOfCustomar.setText("");
      CountryOfCustomar.setText("");
      PhoneNuberOfCustomar.setText("");
      mailOfCustomar.setText("");
    }
     //ForeignCustomarButton
    int ForeignC;
    @FXML
    void ForeignCustomarButton(ActionEvent event)
    {   
        ForeignC=1;
        cusld3.setVisible(true);
        CustomarTypePan.setVisible(false);
       
    }         
     //Local Customar1 Button        
    int LocalC;
    @FXML
    void LocalCustomar1Button(ActionEvent event)
    {   LocalC=1;
        cusld3.setVisible(true);
        CustomarTypePan.setVisible(false);
    }  
   @FXML    
   void CustomarBacktoButton(ActionEvent event)
    {   cusld3.setVisible(true);
        id2.setVisible(false);
        CustomarTypePan.setVisible(false);
    }
    @FXML
    void CustomarResetButton(ActionEvent event) {
        CustomarFirstName.setText("");
        CustomarLastName.setText("");
        CustomarUserName.setText("");
        CustomarPassword.setText("");
        CustomarRetypePassword.setText("");
    }
    @FXML
    private TableColumn<Customar, String> CustomarTableFirstName;

    @FXML
    private TableColumn<Customar, String> CustomarTableLastName;

    @FXML
    private TableColumn<Customar, String> CustomarUserNameTable;
    
    @FXML
    private TableView<Customar> CustomarViewTable;
    ForeignCustomar fc;
    Local_Customar lc;
    ObservableList <Customar> CustomarCreateList = FXCollections.observableArrayList();
   //Log In for Local Customar And Forieng Customar
    
    @FXML
    void loginofcustomarnewaccountButton(ActionEvent event) { 
           if(ForeignC ==1){
           if(CustomarFirstName.getText().length()<=0 || CustomarLastName.getText().length()<=0 || 
      CustomarUserName.getText().length()<=0 || CustomarPassword.getText().length()<=0 || CustomarRetypePassword.getText().length()<=0)
                   {
                      JOptionPane.showMessageDialog(null,"Please Enter Your Full Detail !!!");
                   }
          
           else if(CustomarPassword.getText().equals(CustomarRetypePassword.getText()))
           {
          CustomarCreateList.add(new ForeignCustomar(CustomarFirstName.getText(),
          CustomarLastName.getText(),CustomarUserName.getText(),
          CustomarPassword.getText(),CustomarRetypePassword.getText()));
          JOptionPane.showMessageDialog(null, "Sucessfully Build!!!" );
          
          CustomarTableFirstName.setCellValueFactory(new PropertyValueFactory<>("c_first_name"));    
          CustomarTableLastName.setCellValueFactory(new PropertyValueFactory<>("c_last_name"));    
          CustomarUserNameTable.setCellValueFactory(new PropertyValueFactory<>("c_user_name"));    
          CustomarViewTable.setItems(CustomarCreateList);
          CustomarTableAncorePane.setVisible(true);
          clear(CustomarFirstName,CustomarLastName,CustomarUserName,CustomarPassword,CustomarRetypePassword);
         }
    }
     else if(LocalC ==1) 
    {
        if(CustomarFirstName.getText().length()<=0 || CustomarLastName.getText().length()<=0 || 
       CustomarUserName.getText().length()<=0 || CustomarPassword.getText().length()<=0 || CustomarRetypePassword.getText().length()<=0)
                   {
                      JOptionPane.showMessageDialog(null,"Please Enter Your Full Detail !!!");
                   }
        else if(CustomarPassword.getText().equals(CustomarRetypePassword.getText()))
        {
        CustomarCreateList.add(new Local_Customar(CustomarFirstName.getText(),CustomarLastName.getText(),CustomarUserName.getText(),CustomarPassword.getText(),CustomarRetypePassword.getText()));
       
        JOptionPane.showMessageDialog(null, "Sucessfully Build!!!" );
        CustomarTableFirstName.setCellValueFactory(new PropertyValueFactory<>("c_first_name"));    
        CustomarTableLastName.setCellValueFactory(new PropertyValueFactory<>("c_last_name"));    
        CustomarUserNameTable.setCellValueFactory(new PropertyValueFactory<>("c_user_name"));    
        CustomarViewTable.setItems(CustomarCreateList);
        CustomarTableAncorePane.setVisible(true);
       clear(CustomarFirstName,CustomarLastName,CustomarUserName,CustomarPassword,CustomarRetypePassword);
       
         }
        else
        {
             JOptionPane.showMessageDialog(null, "Retype pass and Pass word can't match");
        }     
    }}
           
    
    //CustomarTypeExitButton
    @FXML
    void xberofcustomarnewaccButton(ActionEvent event) {
          customarnewaccountacpane.setVisible(false);  
    }
    @FXML
    void CustomarTypeExitButton(ActionEvent event) {
           CustomarTypePan.setVisible(false);
    }
    @FXML
    void CreatanewaccoutButton(ActionEvent event) {
          customarnewaccountacpane.setVisible(true);
           cusld3.setVisible(false);
           CustomarTypePan.setVisible(false);
    }
    @FXML
    void regsuccessfullyexitButtton(ActionEvent event) {
        regsuccessfully.setVisible(false);
    }
    @FXML
    void cusld3exitButton(ActionEvent event) {
        cusld3.setVisible(false);
    }
    @FXML
    void cusld3loginButton(ActionEvent event) {
         id2.setVisible(true);
         cusld3.setVisible(false); 
         CustomarTypePan.setVisible(false);         
    }
    @FXML
    void CustomarDetailsExitButton(ActionEvent event) {
       customardetail.setVisible(false);
    }
    @FXML
    void CustomarButton(ActionEvent event) {
        CustomarTypePan.setVisible(true);
         adid2.setVisible(false);
         id1.setVisible(false);
         wellcomead.setVisible(false);
         roomdetail.setVisible(false);
         customardetail.setVisible(false);
         regsuccessfully.setVisible(false);   
         customartableacpane.setVisible(false);
         Authoritypan.setVisible(false);
         CustomarTableAncorePane.setVisible(false);
         
   }
    @FXML
    private JFXTextField Customarusername2;
    @FXML
    private JFXPasswordField Customarpasswordtest2;
   //Customar Login Button
    @FXML
    void cloginbuttons(ActionEvent event) {
    
        if(Customarusername2.getText().isEmpty() ||Customarpasswordtest2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter your username and password first !!");
            }else if(!Customarusername2.getText().isEmpty() ||!Customarpasswordtest2.getText().isEmpty()){
               
                String username1 = Customarusername2.getText();
                String password1 = Customarpasswordtest2.getText();
                
                if(checkLoginCustomar(username1,password1)){
                    customardetail.setVisible(true);
                     clear(Customarusername2,Customarpasswordtest2);
                      id2.setVisible(false); 
                }
                
                }
   }
    
   public boolean checkLoginCustomar(String us, String ps){
         for( Customar list : CustomarCreateList){
                   if(us.equals(list.getC_user_name()) && ps.equals(list. getC_password())){
                       return true;
                 } 
           } 
                  return false;
    }
    @FXML
    void CustomarExitButton(ActionEvent event) { 
        id2.setVisible(false);
        customarnewaccountacpane.setVisible(true);
    }
    public void clear(TextField ... field){
        for(TextField f : field){
            f.clear();
        }
    }
    @FXML
    private TableView<CustomarDetail> customar_table_info;
    @FXML
    private TableColumn<CustomarDetail, String> c_first_name,c_last_name,c_address,c_nationality,c_city,c_country,c_mail;
    int i;
    ObservableList<CustomarDetail> customar_detail_list = FXCollections.observableArrayList(); 
    CustomarDetail cd;
    @FXML
    void RegisterButton(ActionEvent event) {
       i=1;
       if(NameofCustomar.getText().length()<=0 ||LastNameOfCustomar.getText().length()<=0 || AdressOfCustomar.getText().length()<=0
               || NationalityOfCustomar.getText().length()<=0 || CityOfCustomar.getText().length()<=0 || CountryOfCustomar.getText().length()<=0
               || PhoneNuberOfCustomar.getText().length()<=0 || mailOfCustomar.getText().length()<=0)
       {
            JOptionPane.showMessageDialog(null,"Please Enter Your Full Detail !!!");     
       }
       else if(i==1)
       {
          customar_detail_list.add(new CustomarDetail(NameofCustomar.getText(), LastNameOfCustomar.getText(), AdressOfCustomar.getText(), NationalityOfCustomar.getText(), CityOfCustomar.getText(), CountryOfCustomar.getText(),mailOfCustomar.getText()));
         //Entry Data in Table
         c_first_name.setCellValueFactory(new PropertyValueFactory<>("FastName"));
         c_last_name.setCellValueFactory(new PropertyValueFactory<>("Lastname"));
         c_address.setCellValueFactory(new PropertyValueFactory<>("Address"));
         c_nationality.setCellValueFactory(new PropertyValueFactory<>("Nationality"));
         c_city.setCellValueFactory(new PropertyValueFactory<>("City"));
         c_country.setCellValueFactory(new PropertyValueFactory<>("Country")); 
         c_mail.setCellValueFactory(new PropertyValueFactory<>("Mail_number"));
         customar_table_info.setItems(customar_detail_list);
         customartableacpane.setVisible(true);
         clear(NameofCustomar,LastNameOfCustomar,AdressOfCustomar,NationalityOfCustomar,CityOfCustomar,CountryOfCustomar,mailOfCustomar);
         customardetail.setVisible(false);
        } 
    else
       {
       JOptionPane.showMessageDialog(null,"Some thing is Wrong!!!");
       }      
      } 
    @FXML public ComboBox<String> BedType;
    ObservableList <String> list = FXCollections.observableArrayList("Single","Double","Family");
    @FXML public ComboBox<String> City;
    ObservableList <String> list1 = FXCollections.observableArrayList("Dhaka","Barisal","Bogura","Chitagong");
    @FXML public ComboBox<String> RoomType;
    ObservableList <String> list2 = FXCollections.observableArrayList("AC","Non Ac","Warm");
    @FXML public ComboBox<String> EnterCity;
    ObservableList <String> list3 = FXCollections.observableArrayList("Dhaka","Barisal","Bogura","Chitagong");
    @FXML public ComboBox<String> Age;
    ObservableList <String> list4 = FXCollections.observableArrayList("10","11","13","14","15","16","17","18","19","20","21"
    ,"22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46",
    "47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62");
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BedType.setItems(list);
        City.setItems(list1);
        RoomType.setItems(list2);
        EnterCity.setItems(list3);
        Age.setItems(list4);
    }    
}
