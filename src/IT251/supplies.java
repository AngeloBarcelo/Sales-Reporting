/* Not sure exactly what this progrma is supposed to do just yet. I think it 
 * might be some sort of sales reporting program...but not sure just yet. 
 */
package IT251;

/**@author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
public class supplies extends sales
{
    private float apparelSales;
    private float bookSales;
    private float officeSales;
    
    /*Constructor for this the papar class to be overridden. Takes whatever 
    was passed infrom super class*/
    public supplies (String accountId,String dateOrdered,String deptName, 
            String placedBy, float currentSales, float computeSales, 
            float apparelSales, float bookSales, float officeSales)
    {
        super(accountId, dateOrdered, deptName, placedBy, computeSales); 
        this.apparelSales = apparelSales;
        this.bookSales = bookSales;
        this.officeSales = officeSales;
    }

    //Setter for apparel sales
    void setApparelSales (float apparelSales)
    {
        this.apparelSales = apparelSales;
    }
   
    //Getter for apparel sales
    float getApparelSales()
    {
        return apparelSales;
    }
    
    //Setter for book sales 
    void setBookSales (float bookSales)
    {
        this.bookSales = bookSales; 
    }
    
    //Setter for book sales
    public float getBookSales()
    {
        return bookSales;
    }
    
    //Getter for office sales
    void setOfficeSales(float officeSales)
    {
        this.officeSales = officeSales;
    }
            
    //Setter for office sales
    public float getOfficeSales()
    {
        return officeSales;
    }
    
    //Overrides the interface method computSales
    @Override 
    public float computSales()
    {
        return getOfficeSales()+getBookSales()+getApparelSales();
    }
    
    //Overrides the parent class constructor
    @Override      
    public String toString()
    {
        return String.format("%s: %s %n%s %s %s %n%s %s%n%s %s %s %n%s %s %s "
                + "%n%s %s %s %n%s%s %s%s %s", "Employee", getPlacedBy(), "In the", 
                getDeptName(), "department", "Placed an order on", 
                getDateOrdered(), "For $", getApparelSales(), 
                "worth of apparel","For $", getBookSales(), "worth of books", 
                "For $", getOfficeSales(), "worth of office supplies",
                "Billed the account # ", getAccountId(), "for $", +computSales(), 
                "worth of supplies" ); 
    }
}

