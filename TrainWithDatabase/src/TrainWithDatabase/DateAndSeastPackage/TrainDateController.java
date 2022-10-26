package TrainWithDatabase.DateAndSeastPackage;

public class TrainDateController {

        private TrainDateModel dateModel;
        private ViewClassForTrainDateDetails dateView;

        public TrainDateController(TrainDateModel dateModel, ViewClassForTrainDateDetails dateView){
            this.dateModel = dateModel;
            this.dateView = dateView;
        }

        public void setDate(String date){
            dateModel.setDate(date);
        }

        public String getDate(){
            return dateModel.getDate();
        }

        public void setSeats(int seats){
            dateModel.setSeats(seats);
        }

        public int getSeats(){
            return dateModel.getSeats();
        }

        public void updateView(){
            dateView.trainDateDetailsViewMethod(dateModel.getDate(), dateModel.getSeats());
        }
    }

