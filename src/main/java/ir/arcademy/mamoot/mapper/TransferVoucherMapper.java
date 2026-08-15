package ir.arcademy.mamoot.mapper;
import ir.arcademy.mamoot.entity.DepartmentEntity;
import ir.arcademy.mamoot.entity.EmployeeEntity;
import ir.arcademy.mamoot.entity.InventoryGroupEntity;
import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;

import java.util.List;


public class TransferVoucherMapper {

    public TransferVoucherEntity toEntity(
            TransferVoucherDto dto,
            DepartmentEntity department,
            InventoryGroupEntity inventoryGroup,
            EmployeeEntity distributionOfficer) {
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

        // فیلدهای ساده
        dto.setVoucherNumber(entity.getVoucherNumber());
        dto.setVoucherDate(entity.getVoucherDate());
        dto.setVoucherType(entity.getVoucherType());
        dto.setStatus(entity.getStatus());

        // فیلدهای رابطه‌ای
        dto.setDepartmentId(entity.getDepartment().getId());
        dto.setInventoryGroupId(entity.getInventoryGroup().getId());
        dto.setDistributionOfficerId(entity.getDistributionOfficer().getId());


        return dto;
    }

}