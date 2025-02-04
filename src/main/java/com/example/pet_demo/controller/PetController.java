package com.example.pet_demo.controller;

import com.example.pet_demo.dto.PetDTO;
import com.example.pet_demo.service.IPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pet")

public class PetController {
    private final IPetService petService;
    @Autowired
    public PetController(IPetService petService) {
        this.petService = petService;
    }
    @GetMapping("")
    public ResponseEntity<?> getAll() {
            List<PetDTO> response = petService.getAll();
            return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
