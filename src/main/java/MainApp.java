import method.DeretBilangan;
import method.Kelipatan;
import method.StringManipulation;
import utils.MainPage;

public class MainApp {
    public static void main(String[] args) {

        Kelipatan kelipatan = new Kelipatan();
        DeretBilangan deretBilangan = new DeretBilangan();

        kelipatan.mencariKelipatan(100);
        System.out.println();

        deretBilangan.CetakDeretBilangan();
        System.out.println();

        StringManipulation.reArrange(MainPage.T1_1, MainPage.T2_1);
        StringManipulation.reArrange(MainPage.T1_2, MainPage.T2_2);
        StringManipulation.reArrange(MainPage.T1_3, MainPage.T2_3);

    }
}
