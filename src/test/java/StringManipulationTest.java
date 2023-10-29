import method.StringManipulation;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MainPage;

public class StringManipulationTest {
    public String harapan = "CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DTSOAL3/2112/AB000000011 OD:0001234500";
    public static String[] bagianKata = new String[5];
    public static String kataRearrange;

    public static int flag;

    public static String reArrange(String kalimat2){
        for (int loopcontrol = 0; loopcontrol < 5 ; loopcontrol++) {
            flag = 0;
            bagianKata[loopcontrol]="";

            for (char karakter : kalimat2.toCharArray()) {
                if (flag == 18){
                    kalimat2 = kalimat2.substring(flag);
                    break;
                }
                bagianKata[loopcontrol] += karakter;
                flag++;
            }
            System.out.println(bagianKata[loopcontrol].length() + " : " + bagianKata[loopcontrol]);
        }

        kataRearrange = bagianKata[2]+bagianKata[3]+bagianKata[4]+bagianKata[0]+bagianKata[1];
        System.out.println("T2 : " + kataRearrange);
        return kataRearrange;
    }

    @Test
    public void testPertama(){
        Assert.assertEquals(reArrange(MainPage.T2_1), harapan);
    }
}
