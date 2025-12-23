
package Collection1;
class CustomInedxException extends RuntimeException{
    public CustomInedxException(String msg){
        super(msg);
    }
}
class Queue {
    private int capacity = 10;
    private int size;
    private int[] array;

    public Queue() {
        array = new int[capacity];
    }
    public int size() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append((int) array[i] + ", ");
        }
        sb.append(array[size - 1] + "]");
        return sb.toString();
    }
    public void grow() {
        capacity += capacity / 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }
    public void shifting(int ind) {
        for (int i = size; i > ind; i--) {
            array[i] = array[i - 1];
        }
    }
    public void shiftingLeft(int ind) {
        System.out.println(ind);
        for (int i = ind;i<size; i++){
            this.array[i] = this.array[i+1];
        }
       size--;
    }

    /*
        public boolean add(int obj){
            if(capacity==size){
                grow();
            }
            array[size++]=obj;
            return true;
        }
        public boolean addFirst(int obj){
            if(capacity==size){
                grow();
            }
            shifting(0);
            array[0]=obj;
            size++;
            return true;
        }
        public boolean addLast(int obj){
            if(capacity==size){
                grow();
            }
            add(obj);
            return true;
        }
    */
    public boolean push(int obj) {
        if (capacity == size) {
            grow();
        }
        array[size++] = obj;
        return true;
    }
    public boolean pop(int ind){
        if (capacity <ind ||ind>size) {
            throw new CustomInedxException("Out of index");
        }
        shiftingLeft(ind);
        return true;
    }
    public boolean remove(int ind){
        if (capacity <ind ||ind>size) {
            throw new CustomInedxException("Out of index");
        }
        shiftingLeft(ind);
        return true;
    }
    public int get(int ind){
        if(capacity<ind || 0>ind){
            throw new CustomInedxException("Index out of Bounds");
        }
        return array[ind];
    }
}
public class MyQueue {

    public static void main(String[] args) {
        Queue obj=new Queue();

//        System.out.println(obj.size());
//        System.out.println(obj.getCapacity());
//        System.out.println(obj);
        for(int i=1;i<=5;i++){
            obj.push(i*5);
//            System.out.println(obj);
        }
//        obj.addFirst(100);
//        System.out.println(obj);
//        System.out.println(obj.size());
//        System.out.println(obj.addLast(5138));
        System.out.println(obj);
//        System.out.println(obj.pop(3));
        System.out.println(obj.remove(1));
        System.out.println(obj);
//        System.out.println(obj.size());
//        System.out.println(obj.get(1));
    }

}
