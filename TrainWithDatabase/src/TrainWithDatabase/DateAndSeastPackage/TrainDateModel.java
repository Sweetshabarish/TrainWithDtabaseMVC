package TrainWithDatabase.DateAndSeastPackage;

public class TrainDateModel {
    private String Date;
    private int Seats;


    public int getSeats() {
        return Seats;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }
}
