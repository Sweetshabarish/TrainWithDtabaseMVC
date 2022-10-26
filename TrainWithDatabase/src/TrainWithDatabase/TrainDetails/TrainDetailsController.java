package TrainWithDatabase.TrainDetails;

public class TrainDetailsController {
    private TrainDetailsModel trainDetailsObject;
    private TrainDetailsView trainDetailsViewObject;

    public TrainDetailsController(TrainDetailsModel trainDetailsObject, TrainDetailsView trainDetailsViewObject){
        this.trainDetailsObject=trainDetailsObject;
        this.trainDetailsViewObject=trainDetailsViewObject;
    }

    public void setTrainName(String Trainname){
        trainDetailsObject.setTrainName(Trainname);
    }
    public void setTrainNumber(String TrainNumber){
        trainDetailsObject.setTrainNUmber(TrainNumber);
    }
    public void setStratLocation(String stratLocation){
        trainDetailsObject.setStartLocation(stratLocation);
    }
    public void setEndLocation(String endLocation){
        trainDetailsObject.setEndLocation(endLocation);
    }
    public String getTrainName(){
        return trainDetailsObject.getTrainName();
    }
    public String getTrainNumber(){
        return trainDetailsObject.getTrainNUmber();
    }
    public String getStartLocation(){
        return trainDetailsObject.getStartLocation();
    }
    public String getEndLocation(){
        return trainDetailsObject.getEndLocation();
    }
    public void TrainDeatilsUpdate(){
        trainDetailsViewObject.printTrainDetails(trainDetailsObject.getTrainName(),trainDetailsObject.getTrainNUmber(),trainDetailsObject.getStartLocation(),trainDetailsObject.getEndLocation());
    }


}
