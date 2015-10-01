/* Not sure exactly what this progrma is supposed to do just yet. I think it 
 * might be some sort of sales reporting program...but not sure just yet. 
 */
package IT251;

import java.util.Date;

/**@author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
public abstract class sales implements ComputeSales
{
    private String accountId;
    private String dateOrdered;
    private String deptName;
    private String placedBy;
    private float computeSales;
    
    //Sets the account ID
    void setAccoutnId(String accountId)
    {
        this.accountId= accountId; 
    }
    
    //Getter for the account ID
    public String getAccountId()
    {
        return accountId; 
    }
    
    //Sets the date the order was placed
    void setDateOrdered(String dateOrdered)
    {
        this.dateOrdered= dateOrdered;
    }
    
    //Gets the date the order was placed
    public String getDateOrdered()
    {
        return dateOrdered; 
    }
    
    //Sets the name of the dept that placed the order
    void setDeptName (String deptName)
    {
        this.deptName = deptName; 
    }
    
    //Gets the name of the dept that placed the order
    public String getDeptName()
    {
        return deptName;
    }
    
    //Sets who placed the order
    void setPlaceBy (String placedBy)
    {
        this.placedBy = placedBy;
    }
    
    //Gets who placed the order
    public String getPlacedBy()
    {
        return placedBy;
    }
    
    //Creates the interface for computSales
    public interface ComputeSales 
    {   
    float computeSales();
    }
    
    //Getters for the sales ()'s values
    public sales (String accountId, String dateOrdered, String deptName, 
           String placedBy, float computeSales)
    {
        this.accountId = accountId;
        this.dateOrdered = dateOrdered;
        this.deptName = deptName;
        this.placedBy = placedBy;
        this.computeSales +=computeSales;
    }
    //Overrides the sales constructor with the computeSales method
    @Override
    public String toString()
    {
        return String.format("%s%s %n%s%s %n%s%s %n%s%s %n%s%s%n", 
                             "Account ID - ",accountId, 
                             "Date Ordered - ", dateOrdered, 
                             "Dept Name - ", deptName, 
                             "Placed by - ", placedBy,
                             "Total sales - ",computeSales);
    }   
}

