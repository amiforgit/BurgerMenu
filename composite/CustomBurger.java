
/**
 * A customBurger class print the description and price of the customBurger
 * 
 * @Xiaoxiao Li 
 * @3/21/2015
 */
import java.text.DecimalFormat;
public class CustomBurger extends Composite
{
    private double price;
    // instance variables - replace the example below with your own
    public CustomBurger ( String d )
    {
        super(d);
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public void setDecorator(LeafDecorator l)
    {
       this.price = l.price;
    }
}
