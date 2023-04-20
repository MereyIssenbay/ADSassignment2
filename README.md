# Documentation of the second assignment
Here you can find explanations of all functions that I used to solve these problems.

*ArrayList*

**Description:** Increase the buffer of an array.

**Explanation:** It creates a new array by adding + 1 to size of the old one and replace it by copying its elements.

**Solution:** 

```java
public void increaseBuffer(){
        Object[] newArr = new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
```

**Description:** Get size of an array.

**Explanation:** Retrurning the number of elements of an array.

**Solution:** 

```java
@Override
    public int size() {
        return size;
    }
```


**Description:** Check the object.

**Explanation:** By loop ``for each`` it checks each element in array, if our chosen object in array it returns True. Otherwise, it returns False.

**Solution:** 

```java
 @Override
    public boolean contains(Object o) {
        for(Object element : arr){
            if(element != null && element.equals(o)){
                return true;
            }
        }
        return false;
    }
```

**Description:** Add object to array.

**Explanation:** Adding the new element to the end of an array. If it is limit we call the our function increaseBuffer.

**Solution:** 

```java
@Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }
```

**Description:** Add object to array by index.

**Explanation:** Adding the new element to the chosen index of an array. If it is limit we call the our function increaseBuffer.

**Solution:** 

```java
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
```

**Description:** Remove object from an array.

**Explanation:** Remove chosen object from an array.

**Solution:** 

```java
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
```

**Description:**  Remove object from an array by index.

**Explanation:** It removes the object by index and all elements in the array moves to the left to one space.

**Solution:** 

```java
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
```

**Description:** Clear the array.

**Explanation:** It clears the size of an array, deletes all elements. And create new array with the size 1.

**Solution:** 

```java
public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }
```

**Description:** Get the index of object.

**Explanation:** It returns the index of chosen object.

**Solution:** 

```java
@Override
    public Object get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
```

**Description:** Find the first index of object.

**Explanation:** It returns the index of the first occurrence of the chosen object in the array. Otherwise, it returns -1.

**Solution:** 

```java
@Override
    public int indexOf(Object o) {
        for(int i=0; i<size; i++){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;

    }
```
**Description:** Find the last index of object.

**Explanation:** It returns the index of the last occurrence of the chosen object in the array. Otherwise, it returns -1.

**Solution:** 

```java
@Override
    public int lastIndexOf(Object o) {
        for(int i=size-1; i>=0; i--){
            if(arr[i] != null && arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
```

**Description:** Sort the array.

**Explanation:** It sorts the elements of array by ascending order by bubble sort.

**Solution:** 

```java
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
```

**Description:** Checking index for exception.

**Explanation:** It checks if the index is valid for the array. If the index is less than 0 or greater than or equal to the size of the array, it throws an IndexOutOfBoundsException.

**Solution:** 

```java
 public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
```

**Description:** print all method.

**Explanation:** It output each element of array by iteration.

**Solution:** 


```java
 @Override
    public void printALL(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
```
