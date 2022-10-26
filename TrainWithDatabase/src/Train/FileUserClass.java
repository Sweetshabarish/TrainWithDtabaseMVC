package Train;


import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * This is File USer class where we going to store the deatils of each customer and going to display it when another class is called that method
 */
public class FileUserClass {
    /*
     * Create arraylist object for storing the deatils
     */
    static  ArrayList<TrainBookingDeatilsStroingModule> arraylistobject=new ArrayList<>();
    static Scanner scannerobject=new Scanner(System.in);
    ArrayList<TrainBookingDeatilsStroingModule> getUserDetails() {
        return arraylistobject;
    }

    static  ArrayList<TrainBookingDeatilsStroingModule> AddlList(String pnr) {//getting value from the ticket booking class for storing the pnr number for particulur user

        /*
         * Pnr number object is created for storing the pnr number in trainbooking class through arrayobject.
         */
        TrainBookingDeatilsStroingModule pnrNumber = new TrainBookingDeatilsStroingModule(true);
        pnrNumber.setPnr(pnr);
        arraylistobject.add(pnrNumber);


        return arraylistobject;


    }
    static void FileDisplay() {
        AddlList(null);
        display();

    }
    static void display() {//dispaly the persons and the all details ,it will called by the class were ,we need to display the details of the all person,this method is called in flowclass

        //		 return "TrainBooking [ Name=" + Name + ", Location=" + Location + ", Destination=" + Destination
//					+ ", Date=" + Date + ", PhoneNumber=" + PhoneNumber + ", Train NUmber="+TrainNumber+"]";

        t:while(true) {
            System.out.println("================================================");
            System.out.println();
            System.out.println("1:"+Constants.VENKATGIRI_EXPRESS);
            System.out.println("2:"+Constants.CHATRAPATHI_EXPRESS);
            System.out.println("3:Exit ");
            System.out.println();
            System.out.println("================================================");
            int choise =scannerobject.nextInt();
            switch(choise) {

                case 1:{

                    for(int i=0;i<arraylistobject.size();i++) {
                        if(arraylistobject.get(i).getTrainNumber()==101001) {
                            System.out.println("================================================");
                            System.out.println();
                            System.out.println("PASSANGER NAME:"+arraylistobject.get(i).getName());
                            System.out.println("LOCATION: "+arraylistobject.get(i).getLocation());
                            System.out.println("DESTINATION: "+arraylistobject.get(i).getDestination());
                            System.out.println("DATE: "+arraylistobject.get(i).getDate());
                            System.out.println("PHONENUMBER: "+arraylistobject.get(i).getPhonenumber());
                            System.out.println("TRAIN NUMBER: "+arraylistobject.get(i).getTrainNumber());
                            System.out.println("PNR NUMBER:" +arraylistobject.get(i).getPnr());
                            System.out.println();
                            System.out.println("================================================");
                        }

                    }

                }
                break;

                case 2:{
                    for(int i=0;i<arraylistobject.size();i++) {
                        if(arraylistobject.get(i).getTrainNumber()==100101) {
                            System.out.println("================================================");
                            System.out.println();
                            System.out.println("PASSANGER NAME:"+arraylistobject.get(i).getName());
                            System.out.println("LOCATION: "+arraylistobject.get(i).getLocation());
                            System.out.println("DESTINATION: "+arraylistobject.get(i).getDestination());
                            System.out.println("DATE: "+arraylistobject.get(i).getDate());
                            System.out.println("PHONENUMBER: "+arraylistobject.get(i).getPhonenumber());
                            System.out.println("TRAIN NUMBER: "+arraylistobject.get(i).getTrainNumber());
                            System.out.println("PNR NUMBER:" +arraylistobject.get(i).getPnr());
                            System.out.println();
                            System.out.println("================================================");
                        }

                    }


                }


                break;

                case 3:{
                    break t;
                }
            }
        }
    }


}


