package IT251;

/**
 *
 * @author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class Application 
{
    public static void main(String[]args) throws InterruptedException 
    {
        int maxEntries = 5;
        int curEntry = 0;
        int curObject = 0;
        int curSelection;
        sales[] account = new sales [maxEntries];
        String accountId = null;
        String dateOrdered = null;
        String deptName = null;
        String placedBy = null;
        float numHoursSold =0;
        float ratePerHour =0;
        float computeSales =0; 
        float poundsOfPaperSold = 0; 
        float pricePerPound =0;
        float currentSales =0;
        float apparelSales =0;
        float bookSales =0;
        float officeSales =0;
        float ytd = 0;
        
        //Services constructor
        services myServices = new services(accountId,dateOrdered,deptName,
                placedBy, numHoursSold, ratePerHour, computeSales);
        
        //Paper constructor
        paper myPaper = new paper (accountId,dateOrdered, deptName, placedBy, 
                poundsOfPaperSold, pricePerPound, computeSales);
       
        //Supplies constructor
        supplies mySupplies = new supplies(accountId, dateOrdered, deptName, 
                placedBy, currentSales, computeSales, apparelSales, bookSales,  
                officeSales);
        
        //Sets each constructor variable in the array
        account[0]= myServices;
        account[1]= myPaper;
        account[2]= mySupplies;
               
        Scanner input = new Scanner( System.in );
         
        do//Menue option loop. When user enters 4 loop ends.
        {
            do
            {   //The menu options
                System.out.format("%s %n%s %n%s %n%s%n%n",
                        "Menu selection (1-3, 4=quit)", "1=Enter Service", 
                        "2=Enter Paper", "3=Enter Supplies");
                
                curSelection = input.nextInt();
                
                System.out.println();
            } 
            while ((curSelection < 1) || (curSelection > 4));
            
            switch (curSelection)
            {   
                //1 asks the questions and creates services object
                case 1: 
                    System.out.print("Enter service hours:");
                    
                    numHoursSold = input.nextFloat();
                    
                    System.out.print("Enter service rate:");
                    
                    ratePerHour = input.nextFloat();
                    
                    System.out.println();
                   
                    account[curEntry] = new services(accountId, dateOrdered, 
                            deptName, placedBy, numHoursSold, ratePerHour, 
                            computeSales);
                    break;
                
                //2 asks the questions and creates paper object 
                case 2: 
                    System.out.print("Enter paper quantity:");
                    
                    poundsOfPaperSold = input.nextFloat();
                    
                    System.out.print("Enter paper price:");
                    
                    pricePerPound = input.nextFloat();
                    
                    System.out.println();
                    
                    account[curEntry] = new paper (accountId,dateOrdered, 
                            deptName, placedBy, poundsOfPaperSold, 
                            pricePerPound, computeSales);
                    break;
                
                //3 asks the questions and creates supplies object  
                case 3: 
                    System.out.print("Enter supplies apparel sales:");
                    
                    apparelSales = input.nextFloat();
                    
                    System.out.print("Enter supplies book sales:");
                    
                    bookSales = input.nextFloat();
                    
                    System.out.print("Enter supplies office sales:");
                    
                    officeSales = input.nextFloat();
                    
                    account[curEntry] = new supplies (accountId, dateOrdered, 
                            deptName, placedBy, currentSales, computeSales, 
                            apparelSales, bookSales, officeSales);
                    break;
                    
                default:
                    System.out.println("Process sales polymorphically");
                    
                    curObject = 0;
                    
                    // process sales objects through polymorphical calls
                    for (sales clas: account) 
                    {
                        if (clas != null)
                        {
                            System.out.println("Object #" + (curObject+1));
                            
                            System.out.println(clas);
                            
                            clas.computSales();
                            
                            //Adds the total polymorphical to get ytd total
                            ytd+=clas.computSales();
                            
                            curObject += 1;
                        }
                    }
                    break;
            }
            curEntry += 1;
        } 
        while ( curSelection != 4 && curEntry <= maxEntries );
        
        System.out.println("\nTotal Sales for the year is $"+ytd); 
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //creates & sets Jframe to display JPanel with logo and ytd total 
        Sign sign = new Sign();
        
        //Gets the ytd total to add to the frame
        sign.message= "Total sold for the year is $"+String.valueOf(ytd);
        frame.add(sign);
        
        //Sets the size of the frame
        frame.setSize( 1500, 310 );
        
        //Makes the frame visiable 
        frame.setVisible( true );
        frame.setBackground(Color.BLACK);
        
        //Sets the tile for the frame
        frame.setTitle("IT251");
        
        //Sentinal value to allow loop to function
        int x=0;
        
        while (x == 0)
        { 
            //makes frame visible
            frame.setVisible( true );
        
            //makes application sleep for one second
            Thread.sleep(1000);
        
            //makes frame not visible
            frame.setVisible( false );
            
            //makes application sleep for one-half second
            Thread.sleep(500);
        }
    }
}