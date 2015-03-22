
/**
 * Premium topping class
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */
public class Premium extends LeafDecorator
{
    private String[] options;
    /**
     * Constructor for objects of class Burger
     */
    public Premium(String d)
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
            if("Applewood Smoked Bacon".equals(options[i]))
                this.price += 0.50;
            if("Avocado".equals(options[i]))
                this.price +=0.50;
            if("Black Forest Ham".equals(options[i]))
                this.price += 0.75;
            if("Chilli".equals(options[i]))
                this.price += 0.25;
            if("Fried Egg".equals(options[i]))
                this.price += 0.25;
            if("Fried Onion Strings".equals(options[i]))
                this.price += 0.25;
            if("Housemade Guacamole".equals(options[i]))
                this.price += 0.25;
        }
    }
}
