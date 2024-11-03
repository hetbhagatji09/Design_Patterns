package Iterator;

import java.util.Arrays;
import java.util.List;

public class NameRepository implements Container{
    public List<String> names= Arrays.asList("Het","Manisha","Yogesh","Mann");



    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
