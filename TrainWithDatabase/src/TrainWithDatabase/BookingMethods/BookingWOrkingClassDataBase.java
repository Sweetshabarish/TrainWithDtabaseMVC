package TrainWithDatabase.BookingMethods;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;
import TrainWithDatabase.DateAndSeastPackage.DateMain;
import TrainWithDatabase.DateAndSeastPackage.DateStoreDetailsDatabaseExcecution;
import TrainWithDatabase.FileUserDatabase;
import TrainWithDatabase.PnrNumber;
import TrainWithDatabase.TrainConstants;
import TrainWithDatabase.TrainDetails.TrainDetailsMain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookingWOrkingClassDataBase {
    private static Scanner sscannerClassObject = new Scanner(System.in);//Scanner oobject is created for getting the input from the user

    static PnrNumber generateNumberObject = new PnrNumber();

    public static void venkatgiriBookingMethod() throws SQLException {

        System.out.println(TrainConstants.venkatgiriExpress);
        System.out.println(TrainConstants.displayDesign);
        System.out.println();
        TrainDetailsMain.trainDetailsExecution("Select trainname,trainnumber,startlocation,endlocation from traindetails where trainnumber='101101';");

        System.out.println();
        System.out.println(TrainConstants.displayDesign);
        System.out.println(TrainConstants.dateAndTimeDisplay);
        System.out.println("__________________________");

        DateMain.dateEexcutionMethod( "Select date,seats from datedetails where trainnumber='101101'; ");
        System.out.println(TrainConstants.displayDesign);

        System.out.println(TrainConstants.displayDesign);
        t1:
        while (true) {
            TrainConstants.bookingClasMethod();

            String PnrnUmberStoring = " ";//to store pnr number
            int option = sscannerClassObject.nextInt();
            if (option == 1) {



                System.out.println(TrainConstants.enterTheTrainNumber);
                String TrainNumber = sscannerClassObject.next();
                System.out.println(TrainConstants.enterTheDate);
                String gettingdatefromuser = sscannerClassObject.next();//to get date from the user
                ResultSet somewhat = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from datedetails;");
                int StoredSeats=0;
                while (somewhat.next()) {
                    if (gettingdatefromuser.equals(somewhat.getString(3)) && TrainNumber.equals(somewhat.getString(1))) {
                        ResultSet seats= ExcetuteQureyThrowDatabase.connectExecuteQuery("Select seats from datedetails where trainnumber='"+TrainNumber+"' and date='"+ gettingdatefromuser+"' ;");
                        while(seats.next()){
                            StoredSeats=seats.getInt(1);
                        }
                        System.out.println(TrainConstants.enterNumberofSeats);
                        int seatsnumber = sscannerClassObject.nextInt();
                        if (seatsnumber <= 4) {//the one user can book 4 ticket at a time,one pnr can contain 4 tickets
                            PnrnUmberStoring = generateNumberObject.getPnrNumber();//gets a pnr number from pnrgenrating class
                            StoredSeats = StoredSeats - seatsnumber;
                            for (int innerindex = 0; innerindex < seatsnumber; innerindex++) {
                                FileUserDatabase.AddlList(PnrnUmberStoring);//here the process will start.where this will ask the customer details and number of the tickets to book and store in ticket object
                                TrainBookingDeatilsStroingModuleDatabase.methodForTrainBooking();

                            }

//						   TrainObject.setPnr(PnrnUmberStoring);
                            System.out.println(TrainConstants.yourPnrNumber+ PnrnUmberStoring);
                            System.out.println(TrainConstants.leftSeatsAre + StoredSeats);
                            String p = "UPDATE datedetails SET seats = "+StoredSeats+" WHERE date='"+gettingdatefromuser+"' and trainnumber='"+TrainNumber+"';";
                            DateStoreDetailsDatabaseExcecution.dateStoreDetails(p);
                        } else {
                            System.out.println(TrainConstants.youCanBook$Tickets);
                        }

                    }




                }
                break;


            }


            if (option == 2){
                break t1;
            }

        }
    }
    public static  void chatrapathiExpressBookingMethod() throws SQLException {
        System.out.println(TrainConstants.chatrapathiExpress);

        System.out.println(TrainConstants.displayDesign);
        System.out.println(TrainConstants.displayDesign);
        System.out.println();
        TrainDetailsMain.trainDetailsExecution("Select trainname,trainnumber,startlocation,endlocation from traindetails where trainnumber='101102';");

        System.out.println();
        System.out.println(TrainConstants.displayDesign);
        System.out.println(TrainConstants.dateAndTimeDisplay);
        System.out.println(TrainConstants.displayDesign);

        DateMain.dateEexcutionMethod( "Select date,seats from datedetails where trainnumber='101102'; ");

        System.out.println(TrainConstants.displayDesign);
        t1:
        while (true) {
            TrainConstants.bookingClasMethod();
            String PnrnUmberStoring = " ";//to store pnr number
            int option = sscannerClassObject.nextInt();
            if (option == 1) {
                System.out.println(TrainConstants.enterTheTrainNumber);
                String TrainNumber = sscannerClassObject.next();
                System.out.println(TrainConstants.enterTheDate);
                String gettingdatefromuser = sscannerClassObject.next();//to get date from the user
                ResultSet somewhat = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select * from datedetails;");
                int StoredSeats=0;
                while (somewhat.next()) {
                    if (gettingdatefromuser.equals(somewhat.getString(3)) && TrainNumber.equals(somewhat.getString(1))) {
                        ResultSet seats= ExcetuteQureyThrowDatabase.connectExecuteQuery("Select seats from datedetails where trainnumber='"+TrainNumber+"' and date='"+ gettingdatefromuser+"' ;");
                        while(seats.next()){
                            StoredSeats=seats.getInt(1);
                        }
                        System.out.println(TrainConstants.enterNumberofSeats);
                        int seatsnumber = sscannerClassObject.nextInt();
                        if (seatsnumber <= 4) {//the one user can book 4 ticket at a time,one pnr can contain 4 tickets
                            PnrnUmberStoring = generateNumberObject.getPnrNumber();//gets a pnr number from pnrgenrating class
                            StoredSeats = StoredSeats - seatsnumber;
                            for (int innerindex = 0; innerindex < seatsnumber; innerindex++) {
                                FileUserDatabase.AddlList(PnrnUmberStoring);//here the process will start.where this will ask the customer details and number of the tickets to book and store in ticket object
                                TrainBookingDeatilsStroingModuleDatabase.methodForTrainBooking();

                            }

//						   TrainObject.setPnr(PnrnUmberStoring);
                            System.out.println(TrainConstants.yourPnrNumber+ PnrnUmberStoring);
                            System.out.println(TrainConstants.leftSeatsAre + StoredSeats);
                            String p = "UPDATE datedetails SET seats = "+StoredSeats+" WHERE date='"+gettingdatefromuser+"' and trainnumber='"+TrainNumber+"';";
                            DateStoreDetailsDatabaseExcecution.dateStoreDetails(p);
                        } else {
                            System.out.println(TrainConstants.youCanBook$Tickets);
                        }

                    }




                }
                break;


            }


            if (option == 2){
                break t1;
            }

        }
    }
}
