/* Not sure exactly what this progrma is supposed to do just yet. I think it 
 * might be some sort of sales reporting program...but not sure just yet. 
 */
package IT251;

/**@author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
public class services extends sales
{
    float numHoursSold;
    float ratePerHour;
    float computeSales;
    float total;
    String accountId;
    /*Constructor for this the papar class to be overridden. Takes whatever 
    as passed in and allows for variables to be minipulated*/
    public services (String accountId,String dateOrdered,String deptName, 
                     String placedBy, float numHoursSold, float ratePerHour, 
                     float computeSales)
    {   /*Constructor for this the papar class to be overridden. Takes whatever 
        was passed infrom super class*/
        super(accountId, dateOrdered, deptName, placedBy, computeSales);
 
        this.numHoursSold=numHoursSold;    
        this.ratePerHour = ratePerHour;
    }
    
    void setNumHoursSold(float numHoursSold)
    {
        this.numHoursSold = numHoursSold;
    }
    
    public float getNumHoursSold()
    {
        return numHoursSold;
    }
    
    void setRatePerHour(float ratePerHour)
    //Setter for the rate of hours for the services sold
    {
        this.ratePerHour = ratePerHour;
    }
    
    //Getter for the rate of hours for the services sold  
    public float getRatePerHour()
    {
        return ratePerHour;
    }
 
    @Override 
    public float computSales()
    {
    return getRatePerHour()*getNumHoursSold();

    }
    
    //Overriding the constructor
    @Override      
    public String toString()
    {
        //return String.format("%s %s", super.toString(),getComputSalesAmount()+ computeSales);
        return String.format("%s: %s%n%s %s %s%n%s %s%n%s %s %s %s %s %s%n%s %s"
                + " %s%s %s%n", "Employee", getPlacedBy(), "In the", 
                getDeptName(), "department","Placed an order on", 
                getDateOrdered(), "For", getNumHoursSold(), "hours of services",
                "at", getRatePerHour(), "per hour", "Billed account #", 
                getAccountId(), "for $", +computSales(), "worth of services");   
    }
}
