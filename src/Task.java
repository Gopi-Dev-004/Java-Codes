
class A{
int a;
int b;
int c;
}

class B{
    int d;
    int e;
    int f;
}
class C{
    int g;
}


public class Task {
    public static void main(String[] args) {
        String s=" ";
        A objA=new A();
        objA.a=20; objA.b=30;objA.c=40;
        B objB=new B();
        objB.d=(objA.a+objA.c+objA.c)/2;
        objB.e=((objA.a+objA.c+objA.c)/2);
        C objC=new C();
        objC.g=objB.d+objB.e;
        System.out.println(objC.g);
    }
}
