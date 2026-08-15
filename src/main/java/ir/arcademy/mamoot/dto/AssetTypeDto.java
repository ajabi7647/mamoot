package ir.arcademy.mamoot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AssetTypeDto {
    private boolean hasSerialNumber;
    private String model;
    private String title;
    private UUID inventoryGroupId;

}

