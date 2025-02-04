package com.example.pet_demo.dto;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PetDTO {
    private int id;
    private String name;
    private String breed;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
