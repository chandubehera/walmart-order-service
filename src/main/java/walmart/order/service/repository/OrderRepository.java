package walmart.order.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walmart.order.service.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}