package ir.arcademy.mamoot.controller;

import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;
import ir.arcademy.mamoot.entity.EmployeeDeliveredItem;
import ir.arcademy.mamoot.service.EmployeeDeliveredItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ir.arcademy.mamoot.dto.EmployeeDeliveredItemDto;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/delivered")
public class EmployeeDeliveredItemController {

    private final EmployeeDeliveredItemService employeeDeliveredItemService;

    public EmployeeDeliveredItemController(
            EmployeeDeliveredItemService employeeDeliveredItemService) {
        this.employeeDeliveredItemService = employeeDeliveredItemService;
    }

    @GetMapping("/receiver/{receiverId}")
    public ResponseEntity<List<EmployeeDeliveredItemDto>> getItemsByReceiver(
            @PathVariable UUID receiverId) {

        List<EmployeeDeliveredItemDto> items =
                employeeDeliveredItemService.getEmployeeDeliveredItems(receiverId);

        return ResponseEntity.ok(items);
    }
}