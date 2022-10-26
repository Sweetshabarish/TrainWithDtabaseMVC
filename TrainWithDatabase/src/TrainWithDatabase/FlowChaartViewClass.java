package TrainWithDatabase;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlowChaartViewClass {
    public static void displayVenkatGiriExpressPassangers() throws SQLException {

        ResultSet DetailsQuery = ExcetuteQureyThrowDatabase.connectExecuteQuery("Select name,location,destination,date,phonenumber,trainnumber,pnrnumber from userdetails where trainnumber='101101';");
        while (DetailsQuery.next()) {

            System.out.println(TrainConstants.displayTittles);
            System.out.println(DetailsQuery.getString(1) + DetailsQuery.getString(2) + DetailsQuery.getString(3) + DetailsQuery.getString(4) + DetailsQuery.getInt(5) + DetailsQuery.getInt(6) + DetailsQuery.getString(7));

        }

    }
    public static void displayChatrapathiExpressPasaangers() throws SQLException {
        ResultSet DetailsQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery("Select name,location,destination,date,phonenumber,trainnumber,pnrnumber from userdetails where trainnumber='101102';");
        while(DetailsQuery.next()) {

            System.out.println(TrainConstants.displayTittles);
            System.out.println(DetailsQuery.getString(1) + DetailsQuery.getString(2) + DetailsQuery.getString(3) + DetailsQuery.getString(4) + DetailsQuery.getInt(5) + DetailsQuery.getInt(6) + DetailsQuery.getString(7));

        }
    }


}
