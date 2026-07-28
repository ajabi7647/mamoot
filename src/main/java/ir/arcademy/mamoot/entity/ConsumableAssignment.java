package ir.arcademy.mamoot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "consumable_assignments")
public class ConsumableAssignment extends BaseEntity {
    @Column(nullable = false, length = 20)
    private Integer quantity;
    @Column(nullable = false, length = 20)
    private LocalDate deliveryDate;
    @Column(nullable = false, length = 300)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consumable_item_id", nullable = false)
    private ConsumableItem consumableItem;
}