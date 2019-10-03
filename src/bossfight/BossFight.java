
package bossfight;


public class BossFight {

    public static void main(String[] args) {
        BossFight bf = new BossFight();
        bf.banner();
        Customize ctm = new Customize();
    }

    public void banner() {
        System.out.println("██████╗  ██████╗ ███████╗███████╗███████╗██╗ ██████╗ ██╗  ██╗████████╗");
        pause(100);
        System.out.println("██╔══██╗██╔═══██╗██╔════╝██╔════╝██╔════╝██║██╔════╝ ██║  ██║╚══██╔══╝");
        pause(100);
        System.out.println("██████╔╝██║   ██║███████╗███████╗█████╗  ██║██║  ███╗███████║   ██║ ");
        pause(100);
        System.out.println("██╔══██╗██║   ██║╚════██║╚════██║██╔══╝  ██║██║   ██║██╔══██║   ██║  ");
        pause(100);
        System.out.println("██████╔╝╚██████╔╝███████║███████║██║     ██║╚██████╔╝██║  ██║   ██║   ");
        pause(100);
        System.out.println("╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝  ");
        pause(1000);
    }
    
    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
