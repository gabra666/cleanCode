package case3;

import java.util.Iterator;

public class Calculator {

    public long sum(Serie serie, Function function) {
        long result = 0;
        for (Iterator it = serie.iterator(); it.hasNext();) {
            Long i = (Long) it.next();
            result += function.apply(i);
        }
        return result;
    }
}
