package entity;

import entity.baseEntity.ChangeTrackerEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "orderItems")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends ChangeTrackerEntity {

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "subtotal")
    private double subtotal;
}
