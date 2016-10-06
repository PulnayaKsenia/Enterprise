package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

public interface Validator<T> {
    // Валидирует переданое значение
    boolean isValid(T result);
}
