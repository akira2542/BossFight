
package bossfight;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Customize {
    
    Scanner scn;
    Armory TheArmory;
    String[] HeadNameArray = new String[5];
    List HeadList;


    public Customize() {
        scn = new Scanner(System.in);
        TheArmory = new Armory();
    }

    public static void main(String[] args) {
        Customize test = new Customize();
        test.selectHeadArmor();
       //String[] strArray = new String[5];
       //strArray[0] = "Hello";
       //System.out.println(strArray[0]);
    }

    public void selectHeadArmor() {
        System.out.println("[Choose Your Helmet]");
        fetchHead();
        StringBuilder SelectHeadOutput = new StringBuilder();
        for (int i = 0; HeadNameArray[i] != null ; i++) {
                int n = i;
                n++;
                SelectHeadOutput.append(HeadNameArray[i]);
                SelectHeadOutput.append("[").append(n).append("] ");
                
        }
        System.out.println(SelectHeadOutput);
       
    }

    public void fetchHead() {
        HeadList = TheArmory.getHeadArmorArrayList();
        for (int i = 0; i < HeadList.size(); i++) {
            Armor selectedArmor = (Armor) HeadList.get(i);
            HeadNameArray[i] = selectedArmor.getName();
        }
    }
    
        
    
    
    
    
}
