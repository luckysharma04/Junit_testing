import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void should_ReturnTrue_when_QuantityIsEqual() {
        Order order=new Order();

        order.setQuantity(10);

        assertEquals(order.getQuantity(),10);
    }
    @Test
    void should_ReturnTrue_when_PriceIsEqual() {
        Order order=new Order();

        order.setPrice(200000);

        assertEquals(order.getPrice(),200000);
    }
    @Test
    void should_ReturnTrue_PriceWithTexIsEqual() {
        Order order=new Order();

        order.setPriceWithTex(240000.0);

        assertEquals(order.getPriceWithTex(),240000.0);
    }
    @Test
    void should_ReturnTrue_when_ItemIsEqual() {
        Order order=new Order();

        order.setItemName("Laptop");

        assertEquals(order.getItemName(),"Laptop");
    }

}