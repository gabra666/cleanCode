package case3;

import java.util.ArrayList;
import java.util.Iterator;

public class Serie implements Iterable {

    private ArrayList<Long> serie = new ArrayList<Long>();

    public Serie(int min, int max) {
        for(int i= min ; i <= max; i++) {
            serie.add(new Long(i));
        }
    }

    
    @Override
    public Iterator iterator() {
        return serie.iterator();
    }
}
