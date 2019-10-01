
package bossfight;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Customize {
    
    double AP;
    double DEF;
    double EVA;

    
    Scanner scn;
    Armory TheArmory;
    String[] HeadNameArray = new String[5];
    double[] HeadDefArray = new double[5];
    double[] HeadEvaArray = new double[5];
    
    List HeadList;

    String slot_Head;
    String slot_Chest;
    String slot_Weapon;


    public Customize() {
        scn = new Scanner(System.in);
        TheArmory = new Armory();
    }

    public void selectAllArmor() {
        selectHeadArmor();
    }

    private void selectHeadArmor() {
        int maxValidIndex = 0;
        System.out.println("[Choose Your Helmet]");
        fetchHead();
        StringBuilder SelectHeadOutput = new StringBuilder();
        for (int i = 0; HeadNameArray[i] != null ; i++) {maxValidIndex++; };
        for (int i = 0; i<maxValidIndex ; i++) {
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
            if (!isIndexValid(maxValidIndex,0 , armorIndex)){return;}
            System.out.println("You Have Chosen "+HeadNameArray[armorIndex]+"!");
            this.DEF += HeadDefArray[armorIndex];
            this.EVA += HeadEvaArray[armorIndex];      
            showStat(); 
    }

    private boolean isIndexValid(int max,int min,int number) {
        if ( number <= max && number >= min) return true;
        System.out.println("INVALID INPUT, Number out of reach");
        return false;
    }

    public void fetchHead() {
        HeadList = TheArmory.getHeadArmorArrayList();
        for (int i = 0; i < HeadList.size(); i++) {
            Armor selectedArmor = (Armor) HeadList.get(i);
            HeadNameArray[i] = selectedArmor.getName();
            HeadDefArray[i] = selectedArmor.getDef();
            HeadEvaArray[i] = selectedArmor.getEva();
        }
    }
    
    public void showStat() {
        String str = "[Current Stat]\n"+"|Attack "+this.AP+"\n"+"|Defence "+this.DEF+"\n"+"|Evasion "+this.EVA+"\n";
        System.out.println(str);
    }
        
    
    
    
    
}
