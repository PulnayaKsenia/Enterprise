package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

import java.util.List;

public class ExecutorImplement implements Executor<Number> {
    @Override
    public void addTask(Task task) throws ExecuteException {

    }

    @Override
    public void addTask(Task task, Validator validator) throws ExecuteException {

    }

    @Override
    public void execute() {

    }

    @Override
    public List<Number> getValidResults()throws ExecuteException {
        return null;
    }

    @Override
    public List<Number> getInvalidResults() throws ExecuteException {
        return null;
    }
}
