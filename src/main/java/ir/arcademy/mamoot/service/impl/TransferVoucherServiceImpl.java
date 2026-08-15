package ir.arcademy.mamoot.service.impl;

import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.DepartmentEntity;
import ir.arcademy.mamoot.entity.EmployeeEntity;
import ir.arcademy.mamoot.entity.InventoryGroupEntity;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;
import ir.arcademy.mamoot.mapper.TransferVoucherMapper;
import ir.arcademy.mamoot.repository.DepartmentRepository;
import ir.arcademy.mamoot.repository.EmployeeRepository;
import ir.arcademy.mamoot.repository.InventoryGroupRepository;
import ir.arcademy.mamoot.repository.TransferVoucherRepository;
import ir.arcademy.mamoot.service.TransferVoucherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Transactional
@RequiredArgsConstructor
@Service
public class TransferVoucherServiceImpl implements TransferVoucherService {

    private final TransferVoucherRepository transferVoucherRepository;
    private final DepartmentRepository departmentRepository;
    private final InventoryGroupRepository inventoryGroupRepository;
    private final EmployeeRepository employeeRepository;
    private final TransferVoucherMapper transferVoucherMapper;

    @Override
     public TransferVoucherEntity saveTransferVoucher(TransferVoucherDto transferVoucherDto) {
        //متد یافتن نام اداره  از جدول epartment
        DepartmentEntity department = departmentRepository.findById(transferVoucherDto.getDepartmentId())
                .orElseThrow(() ->new RuntimeException("Department not found"));

        //متد یافتن نام گروه انبار(اقلام) از جدول inventorygrgroup
        InventoryGroupEntity inventoryGroup = inventoryGroupRepository.findById(transferVoucherDto.getInventoryGroupId())
                .orElseThrow(() ->new RuntimeException("InventoryGroup not found"));


        //متد یافتن نام مسئول توزیع اقلام از جدول  employee
        EmployeeEntity distributionOfficer = employeeRepository.findById(transferVoucherDto.getDistributionOfficerId())
                .orElseThrow(() ->new RuntimeException("distributionOfficer not found"));

        // تبدیل DTO به Entity
        TransferVoucherEntity entity = transferVoucherMapper.toEntity(
                transferVoucherDto,department,inventoryGroup,distributionOfficer);

        // ذخیره در دیتابیس
        return transferVoucherRepository.save(entity);    }


    @Override
    public List<TransferVoucherDto> getAllTransferVoucher() {

        List<TransferVoucherEntity> entities =
                transferVoucherRepository.findAll();

        List<TransferVoucherDto> dtoList = new ArrayList<>();

        for (TransferVoucherEntity entity : entities) {

            TransferVoucherDto dto =
                    transferVoucherMapper.toDto(entity);

            dtoList.add(dto);
        }

        return dtoList;
    }
    @Override
    public TransferVoucherDto updateTransferVoucher(TransferVoucherDto transferVoucherDto, UUID id) {
        // 1. پیدا کردن رکورد قدیمی از دیتابیس (اگر نبود خطا بده)
        TransferVoucherEntity existingEntity = transferVoucherRepository.findById(UUID , id)
                .orElseThrow(() -> new RuntimeException("حواله با این شناسه پیدا نشد: " + id));

        //  به‌روزرسانی فیلدهای ساده (مثل توضیحات، تاریخ، مبلغ)
        existingEntity.setVoucherNumber(transferVoucherDto.getVoucherNumber());
        existingEntity.setVoucherDate(transferVoucherDto.getVoucherDate());
        existingEntity.getVoucherType(transferVoucherDto.getVoucherType());
        existingEntity.setInventoryGroup(transferVoucherDto.getInventoryGroupId());

        // به روز رسانی فیلدهای رابطه ای تاکنون انجام نشده

    @Override
    public void deleteTransferVoucher(UUID id)


