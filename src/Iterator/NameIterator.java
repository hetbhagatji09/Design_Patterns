package Iterator;

public class NameIterator implements Iterator{
    int index;
    @Override
    public boolean hasNext() {
        if(index<new NameRepository().names.length){

            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return new NameRepository().names[index++];
        }
        return null;
    }
}
