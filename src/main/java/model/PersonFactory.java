package model;

@FunctionalInterface
public interface PersonFactory {
    Person create(String name, int age);
}
