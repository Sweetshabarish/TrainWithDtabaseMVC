package Train;

import java.util.Scanner;
/*
 * Creating this class for displaing the dates in main class
 */
public class DatesofTrain {
    Scanner sccannerObject=new Scanner(System.in);
    DisplayTrainDeatilsClass dateTrainDetailsobject=new DisplayTrainDeatilsClass();//Creating object from the class From DisplayTrainDeatils Class here we can get date
    void datesoftrain() {
        t:while(true) {

            System.out.println("================================================");
            System.out.println();
            System.out.println("1:Venkatgiri Express");
            System.out.println("2:CHatarapthi Express");
            System.out.println("3:EXit");
            System.out.println();
            System.out.println("================================================");

            int s=sccannerObject.nextInt();
            /*
             * iT display the train one details
             */
            if(s==1) {
                System.out.println("================================================");
                System.out.println("_________Dates and Train Vailable Seats________ ");
                System.out.println("================================================");
                System.out.println();
                for(int index=0;index<dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.size();index++) {
                    System.out.print( "Dates: "+dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.get(index).getDate());
                    System.out.println(" "+"Saeats"+dateTrainDetailsobject.trainObject.venkatGiriExpress.dateobject.get(index).getSeats());
                    System.out.println();
                    System.out.println("================================================");

                }
                /*
                 * I t display the train 2 details
                 */
            }else if(s==2) {
                System.out.println("================================================");
                System.out.println("_________Dates and Train Vailable Seats________ ");
                System.out.println("================================================");
                System.out.println();
                for(int index=0;index<dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.size();index++) {
                    System.out.print( "Dates"+dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.get(index).getDate());
                    System.out.println(" "+"Seats"+dateTrainDetailsobject.trainObject.chatrapathiExprees.dateobject.get(index).getSeats());
                    System.out.println();
                    System.out.println("================================================");

                }
            }
            else if(s==3){
                break t;

            }

            else {

                System.out.println("Enter the crt value");
            }
        }
    }
}