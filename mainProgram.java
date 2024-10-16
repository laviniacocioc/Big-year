
import java.util.*;


public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birdsData = new ArrayList<>();
        
        while(true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birdsData.add(bird);
            }
            
            if(command.equals("Observation")) {
                System.out.println("Bird? ");
                String searchedBird = scan.nextLine();
                for(Bird bird : birdsData) {
                    if(searchedBird.equals(bird.getName())){
                        bird.getObsNumber();
                        System.out.println(bird);
                    } else{
                        System.out.println("Not a bird!");
                    }
                    }
                }       
             
            if(command.equals("All")) {
                for(Bird bird : birdsData) {
                    System.out.println(bird);;
                }
            }
            
            if(command.equals("One")) {
                System.out.println("Birds? ");
                String birdSearched = scan.nextLine();
                for(Bird bird : birdsData) {
                    if(birdSearched.equals(bird.getName())) {
                        System.out.println(bird);
                    }
                }
            }
        }
    }

}
