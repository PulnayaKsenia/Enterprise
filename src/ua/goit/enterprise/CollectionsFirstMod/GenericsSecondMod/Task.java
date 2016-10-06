package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

/**
 * Created by DVPComp on 07.10.2016.
 */
public interface Task<T> {
    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();
}
