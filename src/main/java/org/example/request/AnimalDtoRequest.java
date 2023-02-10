package org.example.request;

import java.util.Objects;

public class AnimalDtoRequest {

    private String type;
    private String weight;
    private String height;

    public AnimalDtoRequest(String type, String weight, String height) {
        this.type = type;
        this.weight = weight;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalDtoRequest that = (AnimalDtoRequest) o;
        return Objects.equals(type, that.type) && Objects.equals(weight, that.weight) && Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, height);
    }
}
