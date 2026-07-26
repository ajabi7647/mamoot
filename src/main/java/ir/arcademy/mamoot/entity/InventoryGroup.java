package ir.arcademy.mamoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "inventory_groups")
public class InventoryGroup extends BaseEntity{

    @Column(nullable = false, unique = true, length = 100)
    private String name;
    @Column(nullable = false, length = 50)
    private  String description;


}
