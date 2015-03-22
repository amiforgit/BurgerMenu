 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
       
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        Burger b = new Burger("Burger Options");
        String[] bo = {"Beef", "1/3lb", "on a Bun"};
        b.setOptions(bo);
        
        Cheese c = new Cheese("Cheese Options");
        String[] co = {"Danish Blue Cheese", "Horseradish Cheddar"};
        c.setOptions(co);
        c.wrapDecorator(b);
        
        Toppings t = new Toppings("Topping Options");
        String[] to = {"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"};
        t.setOptions(to);
        t.wrapDecorator(c);
        
        Premium p = new Premium("Premium Options");
        String[] po = {"Applewood Smoked Bacon"};
        p.setOptions(po);
        p.wrapDecorator(t);
        
       Sauce s = new Sauce("Sauce Options");
        String[] so = {"Appricot Sauce"};
        s.setOptions(so);
        s.wrapDecorator(p);
        
        customBurger.setDecorator(s);
        customBurger.addChild(b);
        customBurger.addChild(c);
        customBurger.addChild(t);
        customBurger.addChild(p);
        customBurger.addChild(s);
        
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/