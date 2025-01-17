package Backend;

import java.util.Scanner;

public class Main {

    public static void main(String[] Args){
        Tower startTower = new Tower(0);
        Tower auxTower = new Tower(1);
        Tower endTower = new Tower(2);
        Functionality  functionality = new Functionality();
        int numberOfDisks = 3;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numberOfDisks; i++){
            int diskValue = numberOfDisks - i;  //to make sure the value goes in descending order
            Disk disk = new Disk(diskValue);
            startTower.addToStack(disk);

        }
        
        while(!functionality.checkCompleted(endTower,numberOfDisks)){
            System.out.println("Make a move: (e.g Tower 1 to Tower 2 = 12)");
            String move = scanner.nextLine();
            
            if(move.equals("12")){
                functionality.moveDisk(startTower,auxTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            } else if(move.equals("23")){
                functionality.moveDisk(auxTower,endTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            }
            else if(move.equals("13")){
                functionality.moveDisk(startTower,endTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            }
            else if(move.equals("31")){
                functionality.moveDisk(endTower,startTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            }
            else if(move.equals("32")){
                functionality.moveDisk(endTower,auxTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            }
            else if(move.equals("21")){
                functionality.moveDisk(auxTower,startTower);
                functionality.checkCompleted(endTower, numberOfDisks);
                System.out.println("startTower: " + startTower.getStack());
                System.out.println("auxTower: " + auxTower.getStack());
                System.out.println("endTower: " + endTower.getStack());
            }
        }
        
    }
}
