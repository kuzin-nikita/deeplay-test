package org.example.mapper;

import org.example.model.animal.Animal;
import org.example.model.rule.Rule;
import org.example.request.RuleDtoRequest;

public class RuleMapper {

    public static Rule<Animal> mapRuleDtoRequestToRule(RuleDtoRequest request) {
        return new Rule<>(request.getTypesToCount(), request.getHeightToCount(), request.getWeightToCount());
    }
}
