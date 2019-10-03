package bossfight;

public class Weapon {

    long ItemID;
    String ItemName;
    double ItemAp;
    double critChance;

    public Weapon(long ItemID, String ItemName, double ItemAP,double critChance) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.ItemAp = ItemAP;
        this.critChance = critChance;
    }

    public String getName() {
        return ItemName;
    }
    public double getAP() {
        return ItemAp;
    }
    public double getCrit() {
        return critChance;
    }

}