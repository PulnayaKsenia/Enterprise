package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

public interface Task<T> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();
}
