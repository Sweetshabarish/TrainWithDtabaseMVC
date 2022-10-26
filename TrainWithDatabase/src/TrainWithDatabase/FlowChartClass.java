package TrainWithDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FlowChartClass {
    private  Scanner sscannerClassObject = new Scanner(System.in);
    void methodForFlowChart() throws SQLException {
        t:while(true){
            System.out.println("1."+ TrainConstants.venkatgiriExpress);
            System.out.println("2."+ TrainConstants.chatrapathiExpress);
            System.out.println("3.EXIT");
            int choise=sscannerClassObject.nextInt();
            switch (choise){
                case 1: {
                    FlowChaartViewClass.displayVenkatGiriExpressPassangers();
                }

                case 2: {
                    FlowChaartViewClass.displayChatrapathiExpressPasaangers();
                }
                    break;


                case 3: {
                    break t;
                }


            }

        }
    }
}
