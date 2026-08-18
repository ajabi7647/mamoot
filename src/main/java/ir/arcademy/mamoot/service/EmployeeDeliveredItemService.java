package ir.arcademy.mamoot.service;

import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;
import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface EmployeeDeliveredItemService {
    //"شناسه یک گیرنده (مثلاً یک کارمند یا شخص) را بگیر، تمام آیتم‌هایی که به این گیرنده تحویل داده شده‌اند را از دیتابیس پیدا کن و به صورت یک لیست برگردان."
    List<EmployeeDeliveredItemDto> getEmployeeDeliveredItems(UUID receiverId);
}
