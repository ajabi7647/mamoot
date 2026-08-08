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
@Table(name = "asset_assignments")
public class AssetAssignment extends BaseEntity {
    @Column(nullable = false)
    private LocalDate deliveryDate;
    private LocalDate returnDate;
    @Column(length = 300)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" ,nullable = false)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id" ,nullable = false)
    private Asset asset;
}

