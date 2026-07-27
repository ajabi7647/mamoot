package ir.arcademy.mamoot.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
    @Table(name = "inventory_groups")
    @Getter
    @Setter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public class InventoryGroup extends BaseEntity {

        @Column(nullable = false, unique = true, length = 100)
        private String name;

        @Column(length = 300)
        private String description;

}
