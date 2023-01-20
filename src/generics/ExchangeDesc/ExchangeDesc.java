package generics.ExchangeDesc;

import java.lang.reflect.Constructor;

public class ExchangeDesc {
    public <F extends Currency, T extends Currency> T exchange(F from, Class<T> to) throws ReflectiveOperationException {
        T newCurrency = null;

        float currentValue = from.getValue();

        Constructor<T>[] constructors = (Constructor<T>[]) to.getDeclaredConstructors();
        newCurrency = constructors[0].newInstance(currentValue / 4.66f);

        return newCurrency;
    }


}
