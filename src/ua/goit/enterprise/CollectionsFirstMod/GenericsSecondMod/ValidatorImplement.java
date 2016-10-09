package ua.goit.enterprise.CollectionsFirstMod.GenericsSecondMod;

public class ValidatorImplement implements Validator<Number> {
    @Override
    public boolean isValid(Number result) {
        return result.intValue() < 100;
    }
}
