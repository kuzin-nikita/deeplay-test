package org.example.model.rule;

import org.example.model.animal.Animal;

import java.util.List;
import java.util.Set;

public class  Rule<T extends Animal> {

    private final Set<String> typesToCount;
    private final Set<String> heightToCount;
    private final Set<String> weightToCount;

    public Rule(Set<String> typesToCount, Set<String> heightToCount, Set<String> weightToCount) {
        this.typesToCount = typesToCount;
        this.heightToCount = heightToCount;
        this.weightToCount = weightToCount;
    }

    public long count(List<T> animals) {
        return animals.stream().
                filter(a -> typesToCount.contains(a.getType()) &&
                        heightToCount.contains(a.getHeight()) &&
                        weightToCount.contains(a.getWeight())).count();
    }

    public Set<String> getTypesToCount() {
        return typesToCount;
    }

    public Set<String> getHeightToCount() {
        return heightToCount;
    }

    public Set<String> getWeightToCount() {
        return weightToCount;
    }
}
