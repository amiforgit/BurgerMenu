
/**
 * Cheese decorator class
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */
public class Cheese extends LeafDecorator
{
    private String[] options;
    /**
     * Constructor for objects of class Cheese
     */
    public Cheese(String d)
    {
       super(d);
    }

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
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setOptions(String[] options)
    {
        this.options = options;
        for(int i = 0; i < options.length;i++)
        {
            if("Danish Blue Cheese".equals(options[i]))
                this.price += 0.50;
            if("Horseradish Cheddar".equals(options[i]))
                this.price +=0.50;
            if("Soft Ripened Brie".equals(options[i]))
                this.price += 0.75;
            if("Greek Feta".equals(options[i]))
                this.price += 0.25;
        }
    }
    
}
