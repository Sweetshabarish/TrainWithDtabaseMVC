package TrainWithDatabase.TrainDetails;

import TrainWithDatabase.DatabasePackage.ExcetuteQureyThrowDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainDetailsMain {
    public static void trainDetailsExecution(String Query) throws SQLException {

        TrainDetailsModel trainDetailsModelObject=ExecuteQuery(Query);
        TrainDetailsView trainDetailsViewClassObject=new TrainDetailsView();
        TrainDetailsController trainDetailsControllerClaassObject=new TrainDetailsController(trainDetailsModelObject,trainDetailsViewClassObject);
        trainDetailsControllerClaassObject.TrainDeatilsUpdate();


    }
    public static TrainDetailsModel ExecuteQuery(String query) throws SQLException {
        TrainDetailsModel trainDetailsModelClassObject=new TrainDetailsModel();
        ResultSet DetailsQuery= ExcetuteQureyThrowDatabase.connectExecuteQuery(query);
        while(DetailsQuery.next()){
            trainDetailsModelClassObject.setTrainName(DetailsQuery.getString(1));
            trainDetailsModelClassObject.setTrainNUmber(DetailsQuery.getString(2));
            trainDetailsModelClassObject.setStartLocation(DetailsQuery.getString(3));
            trainDetailsModelClassObject.setEndLocation(DetailsQuery.getString(4));

        }

        return trainDetailsModelClassObject;
    }
}
