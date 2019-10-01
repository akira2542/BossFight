package bossfight;

public class Armor {
    
    long ItemID;
    String ItemName;
    double ItemDef;
    double ItemEva;
    
    public Armor(long ItemID,String ItemName,double ItemDef,double ItemEva) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.ItemDef = ItemDef;
        this.ItemEva = ItemEva;
    }

    public String getName() {
        return ItemName;
    }
    public double getDef() {
        return ItemDef;
    }
    public double getEva() {
        return ItemEva;
    }

    @Override

    public String toString() {
        return "Name:"+ItemName+",Def:"+ItemDef+",Evasion:"+ItemEva;
    }
    
}
