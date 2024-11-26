package repository;

import entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepositoryRepository extends JpaRepository<Order, UUID> {
}
