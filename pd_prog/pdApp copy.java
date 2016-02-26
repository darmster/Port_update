package google;
 
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 
    // PD portal update Fall2013 Multacom GNU GPL* darmilabs_Clause
    public class pdApp {
            public static void main(String[] args)
            {
     
                    // create the text file for the day
                   
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                    String filepath = System.getProperty("user.dir/") + "pd"+sdf.format(d)+".txt";
                    //File file = new File(filepath);
					file = new PrintWriter( new File(filepath,!true)); //new segment 12/12/13
                    if(!file.exists()) {
                        try {
                            file.createNewFile();
                        } catch (IOException ex) {
                            Logger.getLogger(pdApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }                  
                    Order myOrder = new Order();
                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Welcome to Portal Update");
                   
                    int option = 0;
                   
                    do {
                            /* Main Option Window */
                            System.out.println("[1] Order Parts");
                            System.out.println("[2] Update");
                            System.out.println("[3] Port Request");
                            System.out.println("[4] Billing");
                            System.out.println("[5] Regarding");
                            System.out.println("[6] Print Report");
                            System.out.println("[7] Modify");
                            System.out.println("[8] Quit");
                   
                            System.out.print("Enter an option: ");
                            option = userInput.nextInt();
     
                            switch(option) {
                                    case 1:
                                            myOrder.Orderparts(file);
                                    break;
                                    case 2:
                                            myOrder.Update();
                                    break;
                                    case 3:
                                            myOrder.PortRequest(file);
                                    break;
                                    case 4:
                                            myOrder.Billing();
                                    break;
                                    case 5:
                                            myOrder.Regarding();
                                    break;
                                    case 6:
                                            myOrder.Print();
                                    break;
                                   
                                    case 7:
                                            myOrder.Modify();
                                    break;
     
                                    case 8:
                                            System.out.println("----------");
                                    break;
                                           
                                    default:
                                            System.out.println("Hey that's not acceptable!");
                            }
                    } while (option != 8);
            }
    }
     
    /*
     
            this is the home all user interaction starts from here
     
    */