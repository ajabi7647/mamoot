package ir.arcademy.mamoot.dto;

import ir.arcademy.mamoot.entity.InventoryGroup;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

