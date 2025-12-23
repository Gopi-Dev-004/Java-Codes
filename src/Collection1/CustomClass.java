package Collection1;
public class CustomClass {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        System.out.println(obj);
        obj.add(20);
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.getCapacity());

    }
}

 class Myclass {
    private Object[] mc;
    private int size;
    private int capacity=10;
    //constractor for initaly capacity
    public Myclass(){
        mc=new Object[capacity];
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        for(int i=0;i<=size;i++){
            System.out.print(i+" ");

        }
        return "";
    }

    public boolean add(Object obj){
        mc[size++]=obj;
        return true;
    }
}


