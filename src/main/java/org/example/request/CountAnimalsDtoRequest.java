package org.example.request;



import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CountAnimalsDtoRequest{

    private List<AnimalDtoRequest> animals;
    private HashMap<String, RuleDtoRequest> questionToCountingRule;

    public CountAnimalsDtoRequest(List<AnimalDtoRequest> animals, HashMap<String, RuleDtoRequest> textToCountingRule) {
        this.animals = animals;
        this.questionToCountingRule = textToCountingRule;
    }

    public CountAnimalsDtoRequest() {
    }

    public List<AnimalDtoRequest> getAnimals() {
        return animals;
    }

    public void setAnimals(List<AnimalDtoRequest> animals) {
        this.animals = animals;
    }

    public HashMap<String, RuleDtoRequest> getQuestionToCountingRule() {
        return questionToCountingRule;
    }

    public void setQuestionToCountingRule(HashMap<String, RuleDtoRequest> questionToCountingRule) {
        this.questionToCountingRule = questionToCountingRule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountAnimalsDtoRequest)) return false;
        CountAnimalsDtoRequest that = (CountAnimalsDtoRequest) o;
        return Objects.equals(animals, that.animals) && Objects.equals(questionToCountingRule, that.questionToCountingRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animals, questionToCountingRule);
    }
}
