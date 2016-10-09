package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

import java.util.List;

public class Test {
    public void test(List<Task<Integer>> intTasks) throws ExecuteException {
        Executor<Number> numberExecutor = new ExecutorImplement();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new TaskImplement(10L), new ValidatorImplement());

        numberExecutor.execute();

        System.out.println("Valid results: ");
        for (Object number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results: ");
        for (Object number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

    }
}
