package method;

public class DeretBilangan {
    // variable untuk batas looping
    int loopcontrol = 9;
    public void CetakDeretBilangan(){
        for (int nilai1 = 1; nilai1 <= 5; nilai1++) {

            for (int nilai2 = nilai1; nilai2 <= loopcontrol; nilai2++) {
                if (nilai2 % 2 == 0){
                    System.out.print("_");
                }
                else{
                    System.out.print(nilai2);
                }
            }

            loopcontrol -= 1;
            System.out.println();
        }
    }
}
