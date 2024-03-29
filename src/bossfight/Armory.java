package bossfight;

import java.util.ArrayList;
import java.util.List;

public class Armory {
    
    int genIDcount;
    String genID;


    public static void main(String[] args) {
        Armory test1 = new Armory();
        test1.getHeadArmorArrayList();

    }
    
    public List getHeadArmorArrayList() {
       // Armor ArmorName = new Armor(ItemID, ItemName, ItemDef, ItemEva)
        //Head_Armor
        Armor IronHelmet = new Armor(genID(), "Iron Helmet", 5, 0);
        Armor LeatherCap = new Armor(genID(), "Leather Cap", 2, 3);
        Armor GrBerret = new Armor(genID(), "Green Berret", 1, 5);
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

    public List getChestArmorArrayList() {
        Armor IronChestPlate = new Armor(genID(), "Iron Chestplate", 15, 0);
        Armor BronzeShoulder = new Armor(genID(), "Bronze Shoulder Pad", 8, 2);
        Armor LeatherJacket = new Armor(genID(), "LeatherJacket", 5, 3);
        List ArmorArrayList = new ArrayList();
        ArmorArrayList.add(IronChestPlate);
        ArmorArrayList.add(BronzeShoulder);
        ArmorArrayList.add(LeatherJacket);
        return ArmorArrayList;
    }

    public List getWeaponArrayList() {
        Weapon LongSword = new Weapon(genID(), "Long Sword", 10, 3);
        Weapon Mace = new Weapon(genID(), "Mace", 15, 1);
        Weapon Bow = new Weapon(genID(), "Bow", 5, 1);
        List WeaponArrayList = new ArrayList();
        WeaponArrayList.add(LongSword);
        WeaponArrayList.add(Mace);
        WeaponArrayList.add(Bow);
        return WeaponArrayList;
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