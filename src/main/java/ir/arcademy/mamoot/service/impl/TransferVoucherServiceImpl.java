package ir.arcademy.mamoot.service.impl;

import ir.arcademy.mamoot.dto.TransferVoucherDto;
import ir.arcademy.mamoot.entity.TransferVoucherEntity;
import ir.arcademy.mamoot.mapper.TransferVoucherMapper;
import ir.arcademy.mamoot.repository.DepartmentRepository;
import ir.arcademy.mamoot.repository.EmployeeRepository;
import ir.arcademy.mamoot.repository.InventoryGroupRepository;
import ir.arcademy.mamoot.repository.TransferVoucherRepository;
import ir.arcademy.mamoot.service.TransferVoucherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class TransferVoucherServiceImpl implements TransferVoucherService {

    private final TransferVoucherRepository transferVoucherRepository;
    private final DepartmentRepository departmentRepository;
    private final InventoryGroupRepository inventoryGroupRepository;
    private final EmployeeRepository employeeRepository;
    private final TransferVoucherMapper transferVoucherMapper;

    @Override
    public TransferVoucherEntity saveTransferVoucher(
            TransferVoucherDto transferVoucherDto) {
        return null;
    }

    @Override
    public List<TransferVoucherDto> getAllTransferVoucher() {
        return List.of();
    }

    @Override
    public TransferVoucherDto updateTransferVoucher(
            TransferVoucherDto transferVoucherDto, UUID id) {
        return null;
    }

    @Override
    public void deleteTransferVoucher(UUID id) {

    }
}