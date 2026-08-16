package ir.arcademy.mamoot.controller;


import ir.arcademy.mamoot.service.TransferVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/mamoot/")
public class MamootController {

    @Autowired
    private TransferVoucherService transferVoucherService;


    @GetMapping("/hellow")
    public String sayhellow() {
        return "hellow";
    }
}

