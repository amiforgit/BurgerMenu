
/**
 * Sauce decorator class
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */
public class Sauce extends LeafDecorator
{
    private String[] options;
    /**
     * Constructor for objects of class Burger
     */
    public Sauce(String d)
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
    
    public void setOptions(String[] options)
    {
        this.options = options;
        for(int i = 0; i < options.length;i++)
        {
            if("Apricot Sauce".equals(options[i]))
                this.price += 0.50;
            if("Basil Pesto".equals(options[i]))
                this.price +=0.50;
            if("Chipotle Aloli".equals(options[i]))
                this.price += 0.75;
            if("Classic Caesar".equals(options[i]))
                this.price += 0.25;
            if("Dijon Balsamic Dressing".equals(options[i]))
                this.price += 0.25;
            if("Ginger Soy Glaze".equals(options[i]))
                this.price += 0.25;
            if("Honey Mustard".equals(options[i]))
                this.price += 0.25;
        }
    }
}
