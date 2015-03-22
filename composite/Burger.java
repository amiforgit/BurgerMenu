
/**
 * Burger decorator class
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */
public class Burger extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options;

    /**
     * Constructor for objects of class Burger
     */
    public Burger(String d)
    {
       super(d);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getDescription()
    {
        String desc = "";
        for(int i = 0; i<options.length;i++)
        {
            if(i>0) desc += "+" + options[i];
            else desc = options[i];
        }
        return desc;
    
    }
    
    public void setOptions(String[] options)
    {
        this.options = options;
        for(int i = 0; i < options.length;i++)
        {
            if("1/3lb".equals(options[i]))
                this.price += 9.50;
            if("2/3lb".equals(options[i]))
                this.price +=11.50;
            if("1lb".equals(options[i]))
                this.price += 15.50;
            if("In A Bowl".equals(options[i]))
                this.price += 1.50;
        }
    }
    
}