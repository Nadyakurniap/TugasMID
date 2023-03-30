/*  Nama    : St. Nadya Kurnia Prihandani
    Stambuk : 13020210121
 */

public class TestErr20121 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int tot = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10); 
        while (j < 10) { 
            j++;
        }
    }
}
