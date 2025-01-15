public class Tower {
    private int towerNumber;
    private Disk[] order;
    private int numberOfDisks;

    public Tower(int towerNumber, int numberOfDisks){
        this.towerNumber = towerNumber;
        this.order = new Disk[numberOfDisks];
    }

    public int getTowerNumber(){
        return this.towerNumber;
    }

    public Disk[] getOrderArr(){
        return this.order;
    }

    public void addToOrderArr(Disk disk){
        // add to the first open slot
        // might need to make a new function to that
    }

    public void removeFromOrderArr(){
        //remove last element
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Tower: " + this.towerNumber;
    }
}
