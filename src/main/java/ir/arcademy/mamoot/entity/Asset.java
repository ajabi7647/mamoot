package ir.arcademy.mamoot.entity;

import ir.arcademy.mamoot.enume.AssetStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Entity
@Table(name = "assets")
public class Asset extends BaseEntity {
    @Column(nullable = true, length = 50, unique = true)
    private String assetCode;
    @Column(nullable = false, length = 50)
    private String serialNumber;
    @Column(nullable = false , length = 20,unique = true)
    private LocalDateTime entryDate;
    @Column(nullable = false , length = 20,unique = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private AssetType asset_type_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" ,nullable = false)
    private Employee employee;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssetStatus status;
}
