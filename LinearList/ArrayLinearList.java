// Tui Popenoe
// Array Linear List

public class ArrayLinearList{
    // data members
    protected Object [] element;    // array of elements
    protected int size;             // number of elements in array

    // constructors
    // create a list with initial capacity initialCapacity
    // @throws IllegalArgumentException when
    // initialCapacity < 1
    public ArrayLinearList(int initialCapacity){
        if(initialCapacity < 1){
            throw new IllegalArgumentException(
                "initialCapacity must be >= 1");
        }
        element = new Object [initialCapacity];
    }

    // create a list with initial capacity 10
    public ArrayLinearList(){
        this(10);
    }

    // @return true iff list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // @return the number of elements in the list
    public int size(){
        return size;
    }

    // @throws IndexOutOfBoundsException when
    // index is not between 0 and size - 1
    void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
                "index = " + index + " size = " + size);
        }
    }

    // @return element with specified index
    // @ throws IndexOutOfBoundsException when
    // index is not between 0 and size - 1
    public Object get(int index){
        checkIndex(index);
        return element[index];
    }

    // @return index of first occurrence of theElement
    // return -1 if theElement not in the list
    public int indexOf(Object theElement){
        // search elmeent[] for theElement
        for(int i = 0; i < size; i++){
            if(element[i].equals(theElement)){
                return i;
            }
        }
        // theElement not found
        return -1;
    }

    public Object remove(int index){
        checkIndex(index);

        // valid index, shift elements with higher index
        Object removedElement = element[index];
        for(int i = index + 1; i < size; i++){
            element[i - 1] = element[i];
        }
        element[--size] == null; // garbage collection
        return removedElement;
    }

    public void add(int index, Object theElement){
        if(index < 0 || index > size){
            // invalid index
            throw new IndexOutOfBoundsException(
                "index = " + index + " size = " + size);
        }
        // valid index, ensure there is space
        if(size == element.length){
            // no space, double capacity
            element = ChangeArrayLength.changeLength1D(element, 2 * size);
        }

        // shift elements right one position
        for(int i = size -1; i >= index; i--){
            element[i + 1] = element[i];
        }

        element[index] = theElement;
        size++;
    }

    // convert the array linear list to a string
    public String toString(){
        StringBuffer s = new StringBuffer("[");

        // put elements into the buffer
        for(int i = 0; i < size; i++){
            if(element[i] == null){
                s.append("null, ");
            }
            else{
                s.append(elment[i].toString() + ", ");
            }
        }

        if(size > 0){
            s.delete(s.length() - 2, s.length()); // remove last ","
        }

        s.append("]");

        // create equivalent String
        return new String(s);
    }
}