package ir.arcademy.mamoot.service.impl;

import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;
import ir.arcademy.mamoot.repository.EmployeeDelivredItemRepository;
import ir.arcademy.mamoot.repository.EmployeeDelivredItemRepository;
import ir.arcademy.mamoot.service.EmployeeDeliveredItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeDeliveredItemServiceImpl
        implements EmployeeDeliveredItemService {
@Autowired
    private final EmployeeDelivredItemRepository employeeDeliveredItemRepository;

    @Override
    public List<EmployeeDeliveredItem> getEmployeeDeliveredItems(UUID receiverId) {

        return employeeDeliveredItemRepository
                .findByReciver_Id(receiverId);
    }
}