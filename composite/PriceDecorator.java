
/**
 * PriceDecorator used to calculate the cost of a customized burger
 * 
 * @Xiaoxiao Li
 * @3/21/2015
 */
public interface PriceDecorator
{
    void wrapDecorator(PriceDecorator l);
    double getPrice();
}
