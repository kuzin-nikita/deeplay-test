package org.example.dataprocessor;

import org.example.model.animal.Animal;
import org.example.model.rule.Rule;

import java.util.List;

public class DataProcessor<A extends Animal, T extends Rule<A>> {

    public long count(List<A> animals, T rule) {
        return rule.count(animals);
    }

}
