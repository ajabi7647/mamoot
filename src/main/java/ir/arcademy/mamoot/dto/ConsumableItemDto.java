package ir.arcademy.mamoot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class ConsumableItemDto {
    private String name;
    private String description;
    private  String unit;
    private UUID inventoryGroupId;

}
