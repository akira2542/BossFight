package bossfight;

import java.util.ArrayList;
import java.util.List;

public class Armory {
    
    int genIDcount;
    String genID;
    String[] armorArray;

    public static void main(String[] args) {
        Armory test1 = new Armory();
        test1.getHeadArmorArrayList();

    }
    
    public List getHeadArmorArrayList() {
       // Armor ArmorName = new Armor(ItemID, ItemName, ItemDef, ItemEva)
       Armor IronHelmet = new Armor(genID(), "Iron Helmet", 5, -3);
       Armor LeatherCap = new Armor(genID(), "Leather Cap", 2, 3);
       Armor GrBerret = new Armor(genID(), "Green Clot Berret", 1, 5);
       Armor SilverHelmet = new Armor(genID(), "Silver Helmet", 4, 3);

       //ObjectArray
        List ArmorArrayList = new ArrayList();
        ArmorArrayList.add(IronHelmet);
        ArmorArrayList.add(LeatherCap);
        ArmorArrayList.add(GrBerret);
        ArmorArrayList.add(SilverHelmet);


      //****  Armor SelectedArmor = (Armor) ArmorArrayList.get(1);
      //  System.out.println(SelectedArmor.getName());
        
        return ArmorArrayList;
    }

    

    public long genID() {
        this.genIDcount++;
        this.genID = String.format("%03d", genIDcount);
       //Debug
       // System.out.println("formatted :"+this.genID);
        long returnThis = Long.parseLong(this.genID);
        return returnThis;

    }

}