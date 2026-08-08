package ir.arcademy.mamoot.dto;

import ir.arcademy.mamoot.entity.AssetType;
import ir.arcademy.mamoot.enume.AssetStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class AssetDto {
    private String assetCode;
    private String serialNumber;
    private LocalDate entryDate;
    private Long assetTypeId;
    private AssetStatus status;
}
