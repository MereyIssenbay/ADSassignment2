# Documentation
Here you can find explanations of all methods.

#ArrayList

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


#LinkedList

**Description:** Get size of a list.

**Explanation:** Returns the current size of the list.

**Solution:** 

```java
@Override
    public int size() {
        return this.size;
    }
```


**Description:** Check the object.

**Explanation:**  Searches the list for an element by "for" loop and returns true if the element is found, false otherwise.

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

**Description:** Add object to list.

**Explanation:** Adds an element to the end of the list.

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

**Description:** Add object to list by index.

**Explanation:** Method adds an element to a specific index in the list, shifting all subsequent elements to the right..

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

**Description:** Remove object from a list.

**Explanation:** Removes an element from the list by value, and returns true if the element was found and removed, false otherwise.

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

**Description:**  Remove object from a list by index.

**Explanation:** It removes an element from the list by index, shifting all subsequent elements to the left.

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

**Description:** Clear the list.

**Explanation:** Method simply resets the list to an empty state.

**Solution:** 

```java
public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }
```

**Description:** Get the index of object.

**Explanation:** It returns the element at a specific index in the list.

**Solution:** 

```java
@Override
    public Object get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
```

**Description:** Find the first index of object.

**Explanation:** Returns the index of the first occurrence of a specific element in the list, or "-1" if the element is not found.

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

**Explanation:** Method returns the index of the last occurrence of a specific element in the list, or "-1" if the element is not found.

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

**Description:** Sort the list.

**Explanation:** Sorts the list using a selection sort algorithm, assuming that the elements in the list are comparable.

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

**Explanation:** It checks if the index is valid for the list. If the index is less than 0 or greater than or equal to the size of the array, it throws an IndexOutOfBoundsException.

**Solution:** 

```java
 public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
```

**Description:** print all method.

**Explanation:** It output each element of list by iteration.

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

#Stack
