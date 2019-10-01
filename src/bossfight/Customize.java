
package bossfight;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Customize {
    
    double test;
    double AP;
    double DEF;
    double EVA;

    
    Scanner scn;
    Armory TheArmory;
    //Head Array
    List HeadList;
    String[] HeadNameArray;
    double[] HeadDefArray;
    double[] HeadEvaArray;
    //Chest Array
    List ChestList;
    String[] ChestNameArray;
    double[] ChestDefArray;
    double[] ChestEvaArray;
    

    String slot_Head;
    String slot_Chest;
    String slot_Weapon;


    public Customize() {
        scn = new Scanner(System.in);
        TheArmory = new Armory();
        selectHeadArmor();
        selectChestArmor();
    }

   // public void selectAllArmor() {
   //     selectHeadArmor();
   //     selectChestArmor();
   // }

    private void selectHeadArmor() {
        //int maxValidIndex = 0;
        System.out.println("[Choose Your Helmet]");
        fetchHead();
        StringBuilder SelectHeadOutput = new StringBuilder();
       // for (int i = 0; HeadNameArray[i] != null ; i++) {maxValidIndex++; };
        for (int i = 0; i<HeadList.size() ; i++) {
                int n = i;
                n++;
                SelectHeadOutput.append("[").append(n).append("]");
                SelectHeadOutput.append(HeadNameArray[i]);
                SelectHeadOutput.append("(def:").append(HeadDefArray[i]).append(" eva:").append(HeadEvaArray[i]).append(")\n");    
        }
        System.out.println(SelectHeadOutput);
        //User select HeadArmor;
            int armorIndex = scn.nextInt();
            armorIndex--;
            //ValidCheck
            if (!isIndexValid(HeadList.size(),0 , armorIndex)){return;}
            System.out.println("You Have Chosen "+HeadNameArray[armorIndex]+"!");
            DEF += HeadDefArray[armorIndex];
            EVA += HeadEvaArray[armorIndex];      
            test++;
            showStat(); 
    }

    private void selectChestArmor() {
        System.out.println("[Choose Your ChestArmor]");
        fetchChest();
        StringBuilder SelectChestOutput = new StringBuilder();
        for (int i = 0; i<ChestList.size() ; i++) {
                int n = i;
                n++;
                SelectChestOutput.append("[").append(n).append("]");
                SelectChestOutput.append(ChestNameArray[i]);
                SelectChestOutput.append("(def:").append(ChestDefArray[i]).append(" eva:").append(ChestEvaArray[i]).append(")\n");    
        }
        System.out.println(SelectChestOutput);
        //User select HeadArmor;
            int armorIndex = scn.nextInt();
            armorIndex--;
            //ValidCheck
            if (!isIndexValid(ChestList.size(),0 , armorIndex)){return;}
            System.out.println("You Have Chosen "+ChestNameArray[armorIndex]+"!");
            DEF += ChestDefArray[armorIndex];
            EVA += ChestEvaArray[armorIndex];      
            test++;
            showStat(); 
    }

    private boolean isIndexValid(int max,int min,int number) {
        if ( number <= max && number >= min) return true;
        System.out.println("INVALID INPUT, Number out of reach");
        return false;
    }

    public void fetchHead() {
        HeadList = TheArmory.getHeadArmorArrayList();
        HeadNameArray = new String[HeadList.size()];
        HeadDefArray = new double[HeadList.size()];
        HeadEvaArray = new double[HeadList.size()];
        for (int i = 0; i < HeadList.size(); i++) {
            Armor selectedArmor = (Armor) HeadList.get(i);
            HeadNameArray[i] = selectedArmor.getName();
            HeadDefArray[i] = selectedArmor.getDef();
            HeadEvaArray[i] = selectedArmor.getEva();
        }
    }

    public void fetchChest() {
        ChestList = TheArmory.getChestArmorArrayList();
        ChestNameArray = new String[ChestList.size()];
        ChestDefArray = new double[ChestList.size()];
        ChestEvaArray = new double[ChestList.size()];
        for (int i = 0; i < ChestList.size(); i++) {
            Armor selectedArmor = (Armor) ChestList.get(i);
            ChestNameArray[i] = selectedArmor.getName();
            ChestDefArray[i] = selectedArmor.getDef();
            ChestEvaArray[i] = selectedArmor.getEva();
        }
    }
    
    public void showStat() {
        String str = "[Current Stat]\n"+"|Attack "+this.AP+"\n"+"|Defence "+this.DEF+"\n"+"|Evasion "+this.EVA+"\n";
        System.out.println(str);
     //   System.out.println(test);
    }
        
    
    
    
    
}
