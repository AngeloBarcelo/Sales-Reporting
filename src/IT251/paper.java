/* Not sure exactly what this progrma is supposed to do just yet. I think it 
 * might be some sort of sales reporting program...but not sure just yet. 
 */
package IT251;

/**@author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
public class paper extends sales
{
    private float poundsOfPaperSold;
    private float pricePerPound;
    
    /*Constructor for this the papar class to be overridden. Takes whatever 
    was passed infrom super class*/
    public paper (String accountId, String dateOrdered,String deptName, 
                  String placedBy, float poundsOfPaperSold, float pricePerPound, 
                  float computeSales)
    {
        super(accountId, dateOrdered, deptName, placedBy, computeSales);
        
        this.poundsOfPaperSold = poundsOfPaperSold; 
        this.pricePerPound = pricePerPound;   
    }    
    
    //Setter for the price per pound of paper
    void setPricePerPound(float pricePerPound)
    {
        
        this.pricePerPound = pricePerPound;
    }
    
    //Getter for the price per pound of paper
    float getPricePerPound()
    {
        return pricePerPound;
    }
    
    //Setter for the # of pound of paper sold
    void setPoundsOfPaperSold(float poundsOfPaperSold)
    {
    
        this.poundsOfPaperSold = poundsOfPaperSold; 
    }
    
    //Getter for the # of pound of paper sold
    public float getPoundsOfPaperSold()
    {
        return poundsOfPaperSold;
    }
    
    //Overrides coumputSales()
    @Override 
    public float computSales()
    {
        //Gets the methods PoundsOfPaperSold & getPricePerPound to set total
        return getPoundsOfPaperSold()*getPricePerPound();
    }
    
    //Overrides the paper constructor
    @Override      
    public String toString()
    {
        
       //return String.format("%s",super.toString()); 
        return String.format("%s: %s%n%s %s %s%n%s %s%n%s %s %s %s %s %s%n%s %s %s%s %s%n", 
                "Employee", getPlacedBy(), "In the", getDeptName(), "department",
                "Placed an order on", getDateOrdered(), "For", getPoundsOfPaperSold(), 
                "pounds of paper", "at", getPricePerPound(), "per pound",
                "Billed account #", getAccountId(), 
                "for $",+computSales(),"worth of paper" );    
    }
}
    
    

