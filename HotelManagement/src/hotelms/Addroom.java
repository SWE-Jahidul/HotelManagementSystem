
package hotelms;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Addroom {
 
   private SimpleStringProperty  RoomNO;
   private SimpleStringProperty RoomRate;
   private SimpleStringProperty BedType;
   private SimpleStringProperty  City;
   private SimpleStringProperty  RoomType;

    public Addroom(String RoomNO, String RoomRate, String BedType, String City, String RoomType) {
        this.RoomNO = new SimpleStringProperty(RoomNO);
        this.RoomRate = new SimpleStringProperty(RoomRate);
        this.BedType = new SimpleStringProperty(BedType);
        this.City = new SimpleStringProperty(City);
        this.RoomType = new SimpleStringProperty(RoomType);
    }

    public String getRoomNO() {
        return RoomNO.get();
    }

    public String getRoomRate() {
        return RoomRate.get();
    }

    public String getBedType() {
        return BedType.get();
    }

    public String getCity() {
        return City.get();
    }

    public String getRoomType() {
        return RoomType.get();
    }
   
}
