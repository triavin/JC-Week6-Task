package method;

public class Kelipatan {
    //  Mencetak BIZZ jika angka kelipatan 3
    public void kelipatanTiga(){
        System.out.println("BIZZ");
    }

    //  Mencetak BUZZ jika angka kelipatan 5
    public  void kelipatanLima(){
        System.out.println("BUZZ");
    }

    //  Mencetak BIZZBUZZ jika angka kelipatan 3 dan 5
    public void kelipatanTigaDanLima(){
        System.out.println("BIZZBUZZ");
    }

    public void mencariKelipatan(int nilai){
        for (int i = 1; i <= nilai; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                kelipatanTigaDanLima(); // Memanggil method untuk mencetak BIZZBUZZ
//                System.out.println(i);
                continue;
            }
            else if (i % 5 == 0){
                kelipatanLima(); // Memanggil method untuk mencetak BUZZ
//                System.out.println(i);
                continue;
            }
            else if (i % 3 == 0){
                kelipatanTiga();    // Memanggil method untuk mencetak BIZZ
//                System.out.println(i);
                continue;
            }
        }
    }


}
