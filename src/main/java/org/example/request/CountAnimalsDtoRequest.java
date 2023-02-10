package org.example.request;



import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CountAnimalsDtoRequest{

    private List<AnimalDtoRequest> animals;
    private HashMap<String, RuleDtoRequest> textToCountingRule;

    public CountAnimalsDtoRequest(List<AnimalDtoRequest> animals, HashMap<String, RuleDtoRequest> textToCountingRule) {
        this.animals = animals;
        this.textToCountingRule = textToCountingRule;
    }

    public CountAnimalsDtoRequest() {
    }

    public List<AnimalDtoRequest> getAnimals() {
        return animals;
    }

    public void setAnimals(List<AnimalDtoRequest> animals) {
        this.animals = animals;
    }

    public HashMap<String, RuleDtoRequest> getTextToCountingRule() {
        return textToCountingRule;
    }

    public void setTextToCountingRule(HashMap<String, RuleDtoRequest> textToCountingRule) {
        this.textToCountingRule = textToCountingRule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountAnimalsDtoRequest)) return false;
        CountAnimalsDtoRequest that = (CountAnimalsDtoRequest) o;
        return Objects.equals(animals, that.animals) && Objects.equals(textToCountingRule, that.textToCountingRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animals, textToCountingRule);
    }
}
