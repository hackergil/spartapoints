package spartapoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler(CxOrder.class)
public class OrderEventHandler {

    @Autowired
    private OrderRepository orderRepository;

    @HandleAfterCreate
    public void handleCxOrderAfterCreate(CxOrder cxOrder){
        cxOrder.setPoints((int)cxOrder.getTotal());
        cxOrder.setCash(cxOrder.getPoints()/100);

        orderRepository.save(cxOrder);
    }
}
