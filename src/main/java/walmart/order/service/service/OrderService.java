package walmart.order.service.service;

import walmart.order.service.dto.OrderDTO;

import java.util.List;


public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(Long id);
    List<OrderDTO> getAllOrders();
    void deleteOrder(Long id);
}