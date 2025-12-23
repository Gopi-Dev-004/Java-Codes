import java.util.ArrayList;
class CustomIndexOutOfBoundsException extends RuntimeException{
    public CustomIndexOutOfBoundsException(String ms){
        super(ms);
    }
}
class Myclass {
    private int[] mc;
    private Integer size=0;
    private Integer capacity = 10;

    //constractor for initaly capacity
    public Myclass() {
        mc = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    @Override
    public  boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        if(size==0) {
            return  "[]";
        }
        StringBuffer str=new StringBuffer("[");
        for (int i = 0; i <= size-1 ; i++) {
            str.append(mc[i] + ", ");
        }
        str.append(mc[size-1]+"]");
        return str.toString();
    }

    public void grow() {
        capacity += capacity / 2;
        int[] arr = new int[capacity];
        for (int i = 0; i < size; i++) {
            arr[i] = mc[i];
        }
        this.mc = arr;
    }

    public boolean add(Integer obj) {
        if (capacity == size) {
            grow();
        }
        mc[size++] = obj;
        return true;
    }

    public boolean addLast(Integer obj) {
        if (capacity == size) {
            grow();
        }
        add(obj);
        return true;
    }

    public boolean addFirst(Integer obj) {
        if (capacity == size) {
            grow();
        }
        shiftingElement(0);
        return true;
    }

    public Object get(Integer ind){
        if(size<ind && capacity<ind){
            throw new CustomIndexOutOfBoundsException("Out of index exception");
        }
        return mc[ind];
    }
    public Object getFirst(){
        return mc[0];
    }
    public Object getLast(){
        return mc[size-1];
    }
    public void shiftingElement(int ind){
        for(int i=ind;i<size;i--){
            mc[i+1]=mc[i];
        }
    }
    public boolean add(Integer ind, Integer data) {
    if(capacity<ind || ind<0){
        throw new CustomIndexOutOfBoundsException("Index out of bounds");
    }
     if(capacity==size){
        grow();
    }
    shiftingElement(ind);
    mc[ind]=data;
    return true;
    }
}



public class Work {
    public static void main(String[] args) {

//   ArrayList obj=new ArrayList().get()
        Myclass obj = new Myclass();
       // System.out.println(obj);
        for(int i=1;i<=16;i++) {
            obj.add(i*5);
        }

//        System.out.println(obj);
//        System.out.println(obj.size());
//        System.out.println(obj.getCapacity());
//        System.out.println("The value of : "+obj.get(5));
////        System.out.println(obj.get(50));
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj);
        System.out.println(obj);

    }
}