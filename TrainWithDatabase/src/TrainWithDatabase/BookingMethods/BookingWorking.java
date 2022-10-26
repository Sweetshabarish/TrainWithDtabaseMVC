package TrainWithDatabase.BookingMethods;

import TrainWithDatabase.TrainConstants;

import java.sql.SQLException;
import java.util.Scanner;

public class BookingWorking {



    private Scanner sscannerClassObject = new Scanner(System.in);//Scanner oobject is created for getting the input from the user






    public void TrainCLassworkingmethod() throws SQLException {

        t:
        while (true) {
            System.out.println(TrainConstants.displayDesign);

            System.out.println(TrainConstants.displayDesign);
            System.out.println("1."+TrainConstants.venkatgiriExpress);
            System.out.println("2."+TrainConstants.chatrapathiExpress);
            System.out.println("3.Exit");
            System.out.println("---------------------------------------------------------");
            System.out.println();
            int choise = sscannerClassObject.nextInt();

            switch (choise) {
                /*
                 * if case 1 means .traain 1 will activate to get the booking the process
                 */
                case 1: {
                    BookingWOrkingClassDataBase.venkatgiriBookingMethod();
                    break;


                }
                case 2: {
                    BookingWOrkingClassDataBase.chatrapathiExpressBookingMethod();
                    break;




                }
                case 3:{
                    break t;
                }
            }
        }
    }
}