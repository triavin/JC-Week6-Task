package method;

import utils.MainPage;

public class StringManipulation {

    public static String[] bagianKata = new String[5];
    public static String kataRearrange;

    public static int flag;

    public static void reArrange(String kalimat1, String kalimat2){
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
//            System.out.println(bagianKata[loopcontrol].length() + " : " + bagianKata[loopcontrol]);
        }

        kataRearrange = bagianKata[2]+bagianKata[3]+bagianKata[4]+bagianKata[0]+bagianKata[1];

        System.out.println("T1 : " + kalimat1);
        System.out.println("T2 : " + kataRearrange);
    }

    public static void main(String[] args) {
        reArrange(MainPage.T1_1,MainPage.T2_1);
    }
}
