package Has_A_Relationship;

public class Composition {
    /*
    Composition is Strong relationship
    Aggregation where the constained object cannot exist without the container class
    When the container is destroyed, contained object are also destroyed
   Eg : House and Room
     */
    public static void main(String[] args) {
        House h1=new House("BedRoom");
        h1.show();
    }
}

class Room{
    String roomType;
    Room(String roomType){
        this.roomType=roomType;
    }
}
class House{
    Room room;
    House(String type){
        //room is created inside the home
        this.room=new Room(type);
    }
    public void show(){
        System.out.println("House has a "+room.roomType);
    }
}

