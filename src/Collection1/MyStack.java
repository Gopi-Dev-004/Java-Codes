package Collection1;

class StackMe<G>{
    private G[] Stack ;
    private int capacity=10;
    private int size;

    public StackMe (){
      Stack = (G[])(new Object [capacity]);
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
            sb.append((G) Stack[i] + ", ");
        }
        sb.append(Stack[size - 1] + "]");
        return sb.toString();
    }
    private void grow() {
        capacity += capacity / 2;
        G[] newArray = (G[])(new Object [capacity]);
        for (int i = 0; i < size; i++) {
            newArray[i] = Stack[i];
        }
        this.Stack = newArray;
    }
    private void shifting(int ind) {
        for (int i = size; i > ind; i--) {
            Stack[i] = Stack[i - 1];
        }
    }
    private void shiftingLeft(int ind) {
        System.out.println(ind);
        for (int i = ind;i<size; i++){
            this.Stack[i] = this.Stack[i+1];
        }
        size--;
    }

    public boolean push(G obj) {
        if (capacity == size) {
            grow();
        }
        Stack[size++] = obj;
        return true;
    }
    public boolean pop(){
        size--;
        return true;
    }
    public boolean pop(int ind){
        if (capacity <ind ||ind>size) {
            throw new CustomInedxException("Out of index");
        }
        shiftingLeft(ind);
        return true;
    }

}

public class MyStack {
    public static void main(String[] args) {
        StackMe obj = new StackMe();
        obj.push("Gopi");
        obj.push(20);
        obj.push('G');
        obj.push(50.0938f);
        obj.push(50.3747d);

        System.out.println(obj);
//        obj.pop();
//        obj.pop();
//        obj.pop(2);

        System.out.println(obj);
    }

}
