import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterAjouter {

    public Composant core13600k;
    public Composant ryzen5700x;
    public Composant ryzen7800x3d;
    public Composant asusB760;
    public Composant msiB550;
    public Composant tridentzDDR4;
    public Composant tridentzDDR5;
    public Composant samsung980;
    public Composant wdSN850x;
    public  Composant asusRTX4060;
    public Composant gbRTX4060;
    public Configuration config1;
    public Configuration config2;
    @BeforeEach
    void setUp() {
        core13600k = new Composant("CPU", "Intel", "Core i5-13600K", 330);
        ryzen5700x = new Composant("CPU", "AMD", "Ryzen 5 5700X", 260);
        ryzen7800x3d = new Composant("CPU", "AMD", "Ryzen 7 7800X3D", 500);
        asusB760 = new Composant("Carte mère", "Asus", "ROG Strix B760", 200);
        msiB550 = new Composant("Carte mère", "MSI", "B550 Gaming Wifi", 150);
        tridentzDDR4 = new Composant("Ram", "GSkill", "Trident-Z DDR4 32GB", 135);
        tridentzDDR5 = new Composant("Ram", "GSkill", "Trident-Z DDR5 16GB", 90);
        samsung980 = new Composant(" ssd", "Samsung", "980 Pro 2TB", 250);
        wdSN850x = new Composant("ssd ", "Western Digital", "SN850X 1TB", 100);
        asusRTX4060 = new Composant("gpu", "Asus", "RTX 4060", 460);
        gbRTX4060 = new Composant("GPU", "Gigabyte", "RTX 4060", 400);
        config1 = new Configuration("Build test1", 540, new Composant[]{core13600k});
        config2 = new Configuration("Build test2", 1040, new Composant[]{core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k,core13600k});
    }
    @Test
    void ajouter1() {
        assertTrue( config1.ajouter(asusB760));
    }
    @Test
    void ajouter2() {
        assertFalse( config1.ajouter(ryzen5700x));
    }
    @Test
    void ajouter3() {
        assertFalse( config1.ajouter(asusRTX4060));
    }
    @Test
    void ajouter4() {
        assertFalse( config2.ajouter(asusRTX4060));
    }
}