package org.example;

import org.example.model.animal.Animal;
import org.example.model.rule.Rule;
import org.example.request.AnimalDtoRequest;
import org.example.service.AnimalCountService;

import java.util.List;

public class AccountingSystem<A extends Animal, T extends Rule<A>, R extends AnimalDtoRequest> {

    private final AnimalCountService<A, T, R> animalCountService;

    public AccountingSystem(AnimalCountService<A, T, R> animalCountService) {
        this.animalCountService = animalCountService;
    }

    public AccountingSystem() {
        this.animalCountService = new AnimalCountService<>();
    }

    public List<String> count(String json) {
        List<String> results = animalCountService.getCountingResults(json);
        for (String item : results) {
            System.out.println(item);
        }
        return results;
    }


}
