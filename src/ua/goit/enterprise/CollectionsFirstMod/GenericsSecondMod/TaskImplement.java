package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

public class TaskImplement implements Task<Long>{
    private Long result;

    public TaskImplement(Long result) {
        this.result = result;
    }

    @Override
    public void execute() {
        result %= 10;
    }

    @Override
    public Long getResult() {
        return result;
    }
}
