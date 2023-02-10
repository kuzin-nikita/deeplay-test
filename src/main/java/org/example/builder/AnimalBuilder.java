package org.example.builder;

import org.example.model.animal.Animal;
import org.example.request.AnimalDtoRequest;

public class AnimalBuilder implements Builder<Animal, AnimalDtoRequest> {

    public AnimalBuilder() {
    }

    @Override
    public Animal buildAnimal(AnimalDtoRequest request) {
        return new Animal(request.getType(), request.getWeight(), request.getHeight());
    }
}
