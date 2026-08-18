package ir.arcademy.mamoot.service.impl;

import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;
import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;
import ir.arcademy.mamoot.mapper.EmployeeDeliveredItemMapper;
import ir.arcademy.mamoot.repository.EmployeeDelivredItemRepository;
import ir.arcademy.mamoot.repository.EmployeeDelivredItemRepository;
import ir.arcademy.mamoot.service.EmployeeDeliveredItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeDeliveredItemServiceImpl
        implements EmployeeDeliveredItemService {
@Autowired
    private final EmployeeDelivredItemRepository employeeDeliveredItemRepository;
    private final EmployeeDeliveredItemMapper employeeDeliveredItemMapper;
    @Override
    public List<EmployeeDeliveredItemDto> getEmployeeDeliveredItems(UUID receiverId) {

        List<EmployeeDeliveredItem> items =
                employeeDeliveredItemRepository.findByReciver_Id(receiverId);

        List<EmployeeDeliveredItemDto> dtoList = new ArrayList<>();

        for (EmployeeDeliveredItem item : items) {

            EmployeeDeliveredItemDto dto =
                    employeeDeliveredItemMapper.toDto(item);

            dtoList.add(dto);
        }

        return dtoList;
    }
}