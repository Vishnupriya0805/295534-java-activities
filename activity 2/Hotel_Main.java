package Activity1;
import java.util.*;


class HotelRoom  {

    HotelRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi , int chooice){
        if(chooice == 1 && hasWifi == true ){
            int ratePerSqFeet = 10;
            calculateTariff(numberOfSqFeet , ratePerSqFeet+2);
        }if (chooice == 1 && hasWifi == false){
            int ratePerSqFeet = 10;
            calculateTariff(numberOfSqFeet , ratePerSqFeet);
        }if(chooice == 2){
            int ratePerSqFeet = 10;
            calculateTariff(numberOfSqFeet , ratePerSqFeet+10);
        }if(chooice == 3 && hasWifi == true){
            int ratePerSqFeet = 15;
            calculateTariff(numberOfSqFeet ,  ratePerSqFeet +2);
        }if(chooice == 3 && hasWifi == false){
            int ratePerSqFeet = 15;
            calculateTariff(numberOfSqFeet , ratePerSqFeet);
        }
    }

    public void calculateTariff(int numberOfSqFeet ,int  ratePerSqFeet) {
        getRatePerSqFeet();
        System.out.println(numberOfSqFeet * ratePerSqFeet);
    }

    public void getRatePerSqFeet() {
        
    }
}

class DeluxeRoom extends HotelRoom{

    //Constructor
    DeluxeRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi,int chooice){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi, chooice);
        System.out.println("This is Deluxroom");
    }

    /*public void getRatePerSqFeet() {
        int ratePerSqFeet = 10;
        if(chooice == 1 && hasWifi == true ){
            calculateTariff(numberOfSqFeet , ratePerSqFeet+2);
        }
    }*/
}


class DeluxeACRoom extends DeluxeRoom{
    DeluxeACRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi,int chooice){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi, chooice);
    }

    //Include the following public methods :
    //Include a constructor that sets ratePerSqFeet as 12
}

class SuiteACRoom extends HotelRoom{
    SuiteACRoom(String hotelName,int numberOfSqFeet,Boolean hasTV, Boolean hasWifi,int chooice){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi, chooice);
    }

    //Include the following private attributes / data members
    //:ratePerSqFeet –of type Integer.
    //Include the following public methods :
    //Include a constructor that sets ratePerSqFeet as 15.
    //publicHotelRoom(StringhotelName,IntegernumberOfSqFeet,BooleanhasTV,BooleanhasWifi)
    //getRatePerSqFeet –returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.
}

public class Hotel_Main{ 
    public static void main(String[] args) {
        System.out.println("Afrid");
        String hotelName;
        int numberOfSqFeet;

        System.out.println("Hotel Tariff Calculator\n1. Deluxe Room \n2. Deluxe AC \nRoom3. Suite AC Room\nSelect Room Type:");
        
        Scanner sc = new Scanner(System.in);
        final int chooice = sc.nextInt();
        
        System.out.println("Hotel Name:");
        hotelName = sc.next();
        System.out.println("Room Square Feet Area:");
        numberOfSqFeet = sc.nextInt();
        System.out.println("Room has TV (yes/no):");
        Boolean hasTV = sc.nextBoolean();
        System.out.println("Room has Wifi (yes/no):");
        Boolean hasWiFi = sc.nextBoolean();


        switch(chooice) {
            case 1:
              if(chooice == 1 && hasWiFi == true){

              }
              DeluxeRoom deluxroom_obj = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi , chooice);
              break;
            case 2:
              DeluxeACRoom deluxeACRoom_obj = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi, chooice);
              break;
            case 3:
            SuiteACRoom suiteACRoom_obj = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWiFi, chooice);
             break;
          }
          sc.close();

    }  
    /*
    Sample Input Output 1:
    Hotel Tariff Calculator
    1. Deluxe Room
    2. Deluxe AC Room
    3. Suite AC Room
    Select Room Type:
    1 Hotel Name:TajRoom
    Square Feet Area:3200 
    Room has TV (yes/no):yes
    Room has Wifi (yes/no:yesRoom 
    "this we have to produce"Tariff per day is:38400
    */  
}
