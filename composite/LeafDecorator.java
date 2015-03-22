
/**
 * Abstract class LeafDecorator - write a description of the class here
 * 
 * @XiaoxiaoLi
 * @3/21/2015
 */
public abstract class LeafDecorator extends Leaf implements PriceDecorator
{
    // instance variables - replace the example below with your own
    public LeafDecorator(String d)
    {
       super(d);
    } 
    
    public abstract void setOptions(String[] options);
    
    public abstract String getDescription();
    
    public double getPrice()
    {
        return price;
    }
    
    public void wrapDecorator(PriceDecorator l)
    {
        this.price = this.price + l.getPrice();
    }
    
    public void printDescription() {
        System.out.println( getDescription() ) ;
    }
}
