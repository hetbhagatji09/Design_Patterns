package Iterator;

public class NameRepository implements Container{
    public String names[]={"Het","Manisha","Yogesh","Mann"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
