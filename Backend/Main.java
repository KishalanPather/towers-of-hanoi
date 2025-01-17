package Backend;

public class Main {

    public static void main(String[] Args){
        Tower startTower = new Tower(0);
        Tower auxTower = new Tower(1);
        Tower endTower = new Tower(2);
        Functionality  functionality = new Functionality();
        int numberOfDisks = 3;

        for(int i = 0; i < numberOfDisks; i++){
            int diskValue = numberOfDisks - i;  //to make sure the value goes in descending order
            Disk disk = new Disk(diskValue);
            startTower.addToStack(disk);

        }
        System.out.println("Start");
        System.out.println("startTower " + startTower.getStack());
        functionality.moveDisk(startTower,auxTower);
        System.out.println("startTower: "+ startTower.getStack());
        System.out.println("auxTower "+ auxTower.getStack());
        
    }
}
