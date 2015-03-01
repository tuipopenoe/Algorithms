// Tui Popenoe
// Linear List Interface

public interface LinearList{
    public boolean is_empty();
    public int size();
    public Object get(int index);
    public int indexOf(Object elem);
    public Object remove(int index);
    public void add(int index, Object obj);
    public String toString();
}