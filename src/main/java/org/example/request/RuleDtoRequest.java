package org.example.request;

import java.util.Objects;
import java.util.Set;

public class RuleDtoRequest {

    private Set<String> typesToCount;
    private Set<String> heightToCount;
    private Set<String> weightToCount;


    public RuleDtoRequest(Set<String> typesToCount, Set<String> heightToCount, Set<String> weightToCount) {
        this.typesToCount = typesToCount;
        this.heightToCount = heightToCount;
        this.weightToCount = weightToCount;
    }

    public RuleDtoRequest() {
    }

    public Set<String> getTypesToCount() {
        return typesToCount;
    }

    public void setTypesToCount(Set<String> typesToCount) {
        this.typesToCount = typesToCount;
    }

    public Set<String> getHeightToCount() {
        return heightToCount;
    }

    public void setHeightToCount(Set<String> heightToCount) {
        this.heightToCount = heightToCount;
    }

    public Set<String> getWeightToCount() {
        return weightToCount;
    }

    public void setWeightToCount(Set<String> weightToCount) {
        this.weightToCount = weightToCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RuleDtoRequest)) return false;
        RuleDtoRequest that = (RuleDtoRequest) o;
        return Objects.equals(typesToCount, that.typesToCount) && Objects.equals(heightToCount, that.heightToCount) && Objects.equals(weightToCount, that.weightToCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typesToCount, heightToCount, weightToCount);
    }
}
