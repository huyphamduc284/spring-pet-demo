package com.example.pet_demo.service;

import com.example.pet_demo.dto.PetDTO;
import com.example.pet_demo.entity.Pet;

import java.util.List;

public interface IPetService {
    public List<PetDTO> getAll();

}
