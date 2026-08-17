package ir.arcademy.mamoot.mapper;

import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;
import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;

import java.util.UUID;

public class EmployeeDeliveredItemMapper {

    public EmployeeDeliveredItemDto toDto(EmployeeDeliveredItem entity) {
         //تبدیل فیلدهای ساده
        EmployeeDeliveredItemDto dto = new EmployeeDeliveredItemDto();
        dto.setQuantity(entity.getQuantity());
        dto.setAssetCode(entity.getAssetCode());
        dto.setSerial(entity.getSerial());
        dto.setUnit(entity.getUnit());
        dto.setDescription(entity.getDescription());
        //تبدیل فیلدهای رابطه ای
        dto.setReceiverId(entity.getReceiver().getId());
        dto.setDelivererId(entity.getDeliverer().getId());
        if (entity.getAssetType() != null) {
            dto.setAssetTypeId(entity.getAssetType().getId());
        }
        if (entity.getConsumableItem() != null) {
            dto.setConsumableItemId(entity.getConsumableItem().getId());
        }
        return dto;

         }

 
}
