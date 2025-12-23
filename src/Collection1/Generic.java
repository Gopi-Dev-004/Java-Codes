package Collection;

import java.util.ArrayList;

/*
generic class.
class level wildcard
method level wildcard
 */
class Fsd55<T>{//CustomWrapperClass-> immutable (diff type means generics)
    private final T data;
    public Fsd55(T data) {//generic constructor
        this.data = data;
    }
    public T getData() {
        return data;
    }
    @Override
    public String toString() {
        return "[" +data + ']';
    }
    //    public <U super Integer> void genMeth(U data){//lower bound (parent)
//    public <U extends Number> void genMeth(U data){//upper bound (subclass)
//    public <U,V> void genMeth(U data, V data2){//generic method 2 para
    public <U> void genMeth(U data){//generic method 1 para
        System.out.println(data);
    }
    public <S> void multipleParameter(S... data){
        for (S val : data){
            System.out.println(val);
        }
    }
}

public class Generic {
    //Generic - type safe (homogeneous)
    //compile time type checking
    //Non-Generic - type not-safe (heterogeneous)
    //type cast needed
    //may or may not occur ClassCastException
    public static void main(String[] args) {
//        gen1();
//        customWrapperClass1();
//        customWrapperClass2();
        program();
    }
    private static void gen1(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(24);
        al.add(5);
        System.out.println(al);
        Integer i = al.get(0);
        System.out.println(i);
        ArrayList al2 = new ArrayList<Integer>();
        al2.add(12);
        al2.add(24.45);
        al2.add("java");
        System.out.println(al);
        Object i2 = al2.get(0);
        Object i3 = al2.get(1);
        Object i4 = al2.get(2);
        System.out.println(i2+" "+i3+" "+i4+" ");
        for (int j = 0; j < al2.size(); j++) {
            al2.set(j,(String)al2.get(j)+5);//CCE
        }
    }
    private static void customWrapperClass1(){
        Fsd55 obj = new Fsd55(12);
        System.out.println(obj);
        obj = new Fsd55(30);
        System.out.println(obj);
    }
    private static void customWrapperClass2(){
        Fsd55<String> obj1 = new Fsd55<String>("java");
        System.out.println(obj1);
        Fsd55<Double> obj2 = new Fsd55<Double>(1.234);
        System.out.println(obj2);
        Fsd55<Character> obj3 = new Fsd55<Character>('c');
        System.out.println(obj3);
        Fsd55 obj4 = new Fsd55(1.234);
        System.out.println(obj4);
        obj1.genMeth(112);
        obj1.genMeth(112.34);
        obj1.genMeth('c');
        obj1.genMeth("java");
        obj4.multipleParameter(1,"java",'Z',1.23);
    }
    private static void program(){
        //bubble sort
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);al.add(102);al.add(512);al.add(1);
        al.add(83);al.add(53);al.add(123);al.add(2);
        System.out.println(al);
        for (int i =0;i<al.size();i++){
            for (int j =i+1;j<al.size();j++){
                if (al.get(i)>al.get(j)){//swap
                    int temp = al.get(i);
                    al.set(i,al.get(j));
                    al.set(j,temp);
                }
            }
        }
        System.out.println(al);
    }
}
