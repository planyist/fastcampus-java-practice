package model;

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
