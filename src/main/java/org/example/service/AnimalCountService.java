package org.example.service;

import org.example.builder.AnimalBuilder;
import org.example.builder.Builder;
import org.example.dataprocessor.DataProcessor;
import org.example.exception.AccountingSystemException;
import org.example.model.animal.Animal;
import org.example.model.rule.Rule;
import org.example.request.AnimalDtoRequest;
import org.example.request.CountAnimalsDtoRequest;

import java.util.ArrayList;
import java.util.List;

import static org.example.utils.Utils.*;
import static org.example.mapper.RuleMapper.*;

public class AnimalCountService<A extends Animal, T extends Rule<A>, R extends AnimalDtoRequest> {

    private final Builder<A, R> builder;
    private final DataProcessor<A, T> dataProcessor;


    public AnimalCountService(Builder<A, R> builder, DataProcessor<A, T> dataProcessor) {
        this.builder = builder;
        this.dataProcessor = dataProcessor;
    }

    public AnimalCountService() {
        Builder<Animal, AnimalDtoRequest> animalBuilder = new AnimalBuilder();
        this.dataProcessor = new DataProcessor<>();
        this.builder = (Builder<A, R>) new AnimalBuilder();
    }

    public List<String> getCountingResults(String json) {
        List<String> output = new ArrayList<>();
        try {
            CountAnimalsDtoRequest countAnimalsDtoRequest = getInstanceFromJson(json, CountAnimalsDtoRequest.class);
            List<A> animals = new ArrayList<>(countAnimalsDtoRequest.getAnimals().size());
            for (AnimalDtoRequest animal : countAnimalsDtoRequest.getAnimals()) {
                animals.add(builder.buildAnimal((R) animal));
            }
            for (String question : countAnimalsDtoRequest.getTextToCountingRule().keySet()) {
                output.add(question + dataProcessor.count(animals, (T) mapRuleDtoRequestToRule(countAnimalsDtoRequest.getTextToCountingRule().get(question))));
            }
        } catch (AccountingSystemException e) {
            output.add(e.getErrorCode().getMessage());
        }
        return output;
    }


}
