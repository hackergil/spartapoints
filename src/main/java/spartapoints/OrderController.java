package spartapoints;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OrderController {

	@Autowired
    OrderRepository orderRepository;

 	@RequestMapping("/checkversion")
    public String forTesting() {
        return "v1";
    }

    @CrossOrigin()
    @RequestMapping("/ordersByNameSpace")
    public List<CxOrder> findByNameSpace(@RequestParam(required=false, defaultValue="") String nameSpace) {
		List<CxOrder> cxOrders = orderRepository.findByNameSpace(nameSpace);
		System.out.println("In findByNameSpace with "+ nameSpace);
        return cxOrders;
    }

}
