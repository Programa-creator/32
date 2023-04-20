package org.example;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order", "id", id));
    }

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

