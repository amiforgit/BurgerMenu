
/**
 * Toppings decorator class
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */

public class Toppings extends LeafDecorator
{
    private String[] options;
    /**
     * Constructor for objects of class Burger
     */
    public Toppings(String d)
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
            if("Bermuda Red Onion".equals(options[i]))
                this.price += 0.50;
            if("Black Olives".equals(options[i]))
                this.price +=0.50;
            if("Carrot Strings".equals(options[i]))
                this.price += 0.75;
            if("Colostaw".equals(options[i]))
                this.price += 0.25;
            if("Dill Pickle Chips".equals(options[i]))
                this.price += 0.25;
            if("Dried Cranberries".equals(options[i]))
                this.price += 0.25;
            if("Grilled Onions".equals(options[i]))
                this.price += 0.25;
        }
    }
}
