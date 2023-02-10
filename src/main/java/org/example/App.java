package org.example;

import com.google.gson.Gson;
import org.example.model.animal.Animal;
import org.example.model.rule.Rule;
import org.example.request.AnimalDtoRequest;
import org.example.request.CountAnimalsDtoRequest;
import org.example.request.RuleDtoRequest;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AccountingSystem<Animal, Rule<Animal>, AnimalDtoRequest> accountingSystem = new AccountingSystem<>();

        Gson gson = new Gson();

        final String TYPE1 = "Травоядные";
        final String TYPE2 = "Плотоядные";
        final String TYPE3 = "Всеядные";
        final String WEIGHT1 = "Легкое";
        final String WEIGHT2 = "Среднее";
        final String WEIGHT3 = "Тяжелое";
        final String HEIGHT1 = "Маленькое";
        final String HEIGHT2 = "Невысокое";
        final String HEIGHT3 = "Высокое";


        Set<String> types1 = new HashSet<>();
        types1.add(TYPE1);
        Set<String> weights1 = new HashSet<>();
        weights1.add(WEIGHT1);
        weights1.add(WEIGHT2);
        weights1.add(WEIGHT3);
        Set<String> heights1 = new HashSet<>();
        heights1.add(HEIGHT1);
        heights1.add(HEIGHT2);
        heights1.add(HEIGHT3);

        Set<String> types2= new HashSet<>();
        types2.add(TYPE1);
        types2.add(TYPE2);
        Set<String> weights2 = new HashSet<>();
        weights2.add(WEIGHT1);
        weights2.add(WEIGHT2);
        weights2.add(WEIGHT3);
        Set<String> heights2 = new HashSet<>();
        heights2.add(HEIGHT1);

        Set<String> types3 = new HashSet<>();
        types3.add(TYPE3);
        Set<String> weights3 = new HashSet<>();
        weights3.add(WEIGHT1);
        weights3.add(WEIGHT2);
        weights3.add(WEIGHT3);
        Set<String> heights3 = new HashSet<>();
        heights3.add(HEIGHT1);
        heights3.add(HEIGHT2);

        RuleDtoRequest rule1 = new RuleDtoRequest(types1, heights1, weights1);
        RuleDtoRequest rule2 = new RuleDtoRequest(types2, heights2, weights2);
        RuleDtoRequest rule3 = new RuleDtoRequest(types3, heights3, weights3);

        String question1 = "Сколько животных – травоядных:";
        String question2 = "Сколько животных – травоядных или плотоядных и они при этом маленькие:";
        String question3 = "Сколько животных – всеядных, но не являются высокими:";

        HashMap<String, RuleDtoRequest> questionsToCount = new HashMap<>(3);
        questionsToCount.put(question1, rule1);
        questionsToCount.put(question2, rule2);
        questionsToCount.put(question3, rule3);

        List<AnimalDtoRequest> animals = new ArrayList<>();
        AnimalDtoRequest animal1 = new AnimalDtoRequest(TYPE1, WEIGHT1, HEIGHT1);
        AnimalDtoRequest animal2 = new AnimalDtoRequest(TYPE2, WEIGHT1, HEIGHT1);
        AnimalDtoRequest animal3 = new AnimalDtoRequest(TYPE3, WEIGHT1, HEIGHT1);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        CountAnimalsDtoRequest request = new CountAnimalsDtoRequest(animals, questionsToCount);

        String json = gson.toJson(request);

        accountingSystem.count(json);






    }
}
