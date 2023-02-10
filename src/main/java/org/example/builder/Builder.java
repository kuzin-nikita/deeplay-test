package org.example.builder;

import org.example.model.animal.Animal;
import org.example.request.AnimalDtoRequest;

public interface Builder<A extends Animal, R extends AnimalDtoRequest> {

    A buildAnimal(R request);

}
