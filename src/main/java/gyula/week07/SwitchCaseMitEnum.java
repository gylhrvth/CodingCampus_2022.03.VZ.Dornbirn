package gyula.week07;

public class SwitchCaseMitEnum {
    public enum DoorStateEnum {
        OPEN,
        CLOSED_NOT_LOCKED,
        LOCKED
    }

    public static void setDoor(DoorStateEnum status){

    }


    public static void main(String[] args) {
        int testValue = 2;
/*
        if (testValue == 0){
            System.out.println("A");
        } else if (testValue == 1) {
            System.out.println("B");
        } else if (testValue == 2) {
            System.out.println("C");
        } else if (testValue == 3) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
*/
        switch (testValue){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }


        System.out.println(DoorStateEnum.OPEN);
        setDoor(DoorStateEnum.LOCKED);
        // setDoor(-2); // INVALID CODE
    }
}
