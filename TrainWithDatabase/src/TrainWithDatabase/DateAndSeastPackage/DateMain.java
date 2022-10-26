package TrainWithDatabase.DateAndSeastPackage;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DateMain {
public static void dateEexcutionMethod(String Query) throws SQLException {

    TrainDateModel dateModelObject=trianDateDetails(Query);
    ViewClassForTrainDateDetails viewDateObject=new ViewClassForTrainDateDetails();
    TrainDateController dateControllerClassObject=new TrainDateController(dateModelObject,viewDateObject);
    dateControllerClassObject.updateView();




}

    public static TrainDateModel trianDateDetails(String query) throws SQLException {
        TrainDateModel dateModelObject=new TrainDateModel();
        ResultSet DateQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        while(DateQuery.next()){
            dateModelObject.setDate(DateQuery.getString(1));
            dateModelObject.setSeats(DateQuery.getInt(2));


        }
        return dateModelObject;
    }
}
