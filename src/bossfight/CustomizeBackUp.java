
package bossfight;
import java.util.Scanner;

public class Customize {
    
    double atk;
    double def;
    double eva;
    int startingPoints;
    int healthPotions;
    String[] HeadArmourArray;
    double[] HeadArmourDefValue;
    double[] HeadArmourEvasion;
    String[] ChestArmourArray;
    double[] ChestArmourDefValue;
    double[] ChestArmourEvasion;
    Scanner scn;
    int armourIndex;
    
    Customize() {
        this.scn = new Scanner(System.in);
        //armour
            //head
            HeadArmourArray = new String[]{"Iron Helmet","Feather Berret"};
            HeadArmourDefValue = new double[]{5,2};
            HeadArmourEvasion = new double[] {-2,4};
            //chest
            ChestArmourArray = new String[]{"Plate Armour","Leather Armour","No Amour"};
            ChestArmourDefValue = new double[]{12,8,0};
            ChestArmourEvasion = new double[] {-5,8,14};
            
    }
    
    public void armour() {
        //Helmet
        System.out.println("[Choose Your Helmet]");
       // System.out.println(HeadArmourArray[0]+"[1]"+" "+HeadArmourArray[1]+"[2]");
         int max;
         max = HeadArmourArray.length;
        StringBuilder headStr = new StringBuilder();
         for (int i=0; i < max; i++) {
            int n = i;
            headStr.append(HeadArmourArray[0]);
            headStr.append("[").append(n+1).append("] ");
    }
         System.out.println(headStr);
        
        
        
        armourIndex = scn.nextInt();
      /*  boolean minCheck = false;
        boolean maxCheck = false;
        if (armourIndex < 1) minCheck = true;
        if (armourIndex > 2) maxCheck = true;
        if (minCheck || maxCheck){
            System.out.println("INVALID");
            return; 
        }
else */

            if (!isValid(1,max,armourIndex))return;
            armourIndex -= 1;
             this.def += HeadArmourDefValue[armourIndex];
             this.eva += HeadArmourEvasion[armourIndex];
            System.out.println("you have choosen "+HeadArmourArray[armourIndex]);
            showTotal();
        
        //Chest Armour
        
    }
    
    private boolean isValid(int min,int max,int checkNum) {
        boolean minCheck = false;
        boolean maxCheck = false;
        if (armourIndex < min) minCheck = true;
        if (armourIndex > max) maxCheck = true;
        if (minCheck || maxCheck){
            System.out.println("INVALID");
            return false; 
        }
        else
        return true;
    }
    
    public void showTotal() {
        StringBuilder total = new StringBuilder();
        total.append("[Current Stat]");
        total.append("\nDef : ");
        total.append(this.def);
        total.append("\tEva : ");
        total.append(this.eva);
        System.out.println(total);
    }
        
    
    
    
    
}
