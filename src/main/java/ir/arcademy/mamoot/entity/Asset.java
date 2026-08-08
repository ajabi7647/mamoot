package ir.arcademy.mamoot.entity;

import ir.arcademy.mamoot.enume.AssetStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
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

    @Column(length = 100, unique = true)
    private String serialNumber;

    @Column(nullable = false , length = 20)
    private LocalDate entryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_type_id", nullable = false)
    private AssetType assetType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssetStatus status;
}
