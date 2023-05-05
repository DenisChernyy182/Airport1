public class Elevator {
    public int currentFloor;
    public final int minFloor;
    public final int maxFloor;


      public Elevator (int minFloor, int maxFloor) {
        this.currentFloor = 1;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown(){
        if (currentFloor == minFloor) {
            System.out.println("Ошибка");
            return;
        } else {
            currentFloor -= 1;
        }
    }

    public void moveUp() {
        if (currentFloor == maxFloor) {
            System.out.println("Ошибка");
            return;
        } else {
            currentFloor += 1;
        }
    }

    public void move(int floor){
        if (floor >= minFloor && floor <= maxFloor && floor != currentFloor) {
            int moveStep = floor > currentFloor ? 1 : -1;
            do {
                currentFloor += moveStep;
                System.out.println("Этаж: " + currentFloor);
            } while (floor != currentFloor);
        } else {
            System.out.println("такого этажа не существует");
        }
    }
}
