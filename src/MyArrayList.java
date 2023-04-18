public class MyArrayList<T> implements MyList {
    private Object[] arr;
    private int size = 0;

    MyArrayList(){
        this.arr = new Object[5];
        this.size = 0;
    }
    public void increaseBuffer(){
        Object[] newArr = new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    public T getElement(int index) {
        checkIndex(index);
        return (T) arr[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for(Object element : arr){
            if(element != null && element.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void add(Object item, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length) {
            increaseBuffer();
        }
        for(int i=size-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = item;
        size++;
    }

    @Override
    public boolean remove(Object item) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i].equals(item)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    public void delete(int index){
        checkIndex(index);
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}