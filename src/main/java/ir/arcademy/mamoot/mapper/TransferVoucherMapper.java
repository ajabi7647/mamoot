package ir.arcademy.mamoot.mapper;
import ir.arcademy.mamoot.entity.Department;
import ir.arcademy.mamoot.entity.Employee;
import ir.arcademy.mamoot.entity.InventoryGroup;
import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;


public class TransferVoucherMapper {

    public TransferVoucherEntity toEntity(
            TransferVoucherDto dto,
            Department department,
            InventoryGroup inventoryGroup,
            Employee distributionOfficer) {
        TransferVoucherEntity entity = new TransferVoucherEntity();

        entity.setVoucherNumber(dto.getVoucherNumber());
        entity.setVoucherDate(dto.getVoucherDate());
        entity.setVoucherType(dto.getVoucherType());
        entity.setStatus(dto.getStatus());
        entity.setDepartment(department);
        entity.setInventoryGroup(inventoryGroup);
        entity.setDistributionOfficer(distributionOfficer);
        return entity;
    }


    public TransferVoucherDto toDto(TransferVoucherEntity entity) {

        TransferVoucherDto dto = new TransferVoucherDto();

        dto.setVoucherNumber(entity.getVoucherNumber());
        dto.setVoucherDate(entity.getVoucherDate());
        dto.setVoucherType(entity.getVoucherType());
        dto.setStatus(entity.getStatus());

        return dto;
    }

}