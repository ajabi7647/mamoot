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
@Table(name = "assettype")
public class AssetType extends BaseEntity {

    @Column(nullable = false, unique = true, length = 20)
    private String modle;
    @Column(nullable = true, length = 100)
    private String hasSerialNumber;
    @Column(length = 30)
    private String name;
}
