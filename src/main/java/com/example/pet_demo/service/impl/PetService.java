package com.example.pet_demo.service.impl;

import com.example.pet_demo.dto.PetDTO;
import com.example.pet_demo.entity.Pet;
import com.example.pet_demo.repository.IPetRepository;
import com.example.pet_demo.service.IPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PetService implements IPetService {
    private final IPetRepository petRepository;

    @Autowired
    public PetService(IPetRepository petRepository) {
        this.petRepository = petRepository;
    }
    @Override
    public List<PetDTO> getAll() {
    try {
    List<Pet> pets = petRepository.findAll();
    return pets.stream().map(pet -> {
        PetDTO petDto = new PetDTO();
        petDto.setId(pet.getId());
        petDto.setName(pet.getName());
        petDto.setBreed(pet.getBreed());

        return petDto;
    }).toList();
    }catch (Exception e) {
        throw new RuntimeException("Error to get list of pets", e);
    }

    }
}
