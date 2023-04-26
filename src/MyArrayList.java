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
    public void addAllindex(Object[] arr2, int index) {
        checkIndex(index);
        if (size == arr.length) {
            increaseBuffer();
        }
        for(int i=size-1; i>=index; i--){
            arr[i + arr2.length] = arr[i];
        }
        for (int i = 0;i < arr2.length; i++ ){
            arr[i + index + 1] = arr2[i];
        }
        size += arr2.length;
    }

    @Override
    public void addAllindexLinked(Object o, int index) {
        return;
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
        checkIndex(index);
        T removed = (T) arr[index];
        for(int i=index; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        size--;
        return removed;
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
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;

    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i=size-1; i>=0; i--){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable)arr[i]).compareTo(arr[j]) > 0) {
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    @Override
    public void printALL(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

}