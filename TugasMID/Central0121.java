/*  Nama    : St. Nadya Kurnia Prihandani
    Stambuk : 13020210121
 */

 
interface A{  void aaa(); }

interface B extends A{  void bbb(); }

class Central0121 implements B{
    public void aaa() {
        System.out.println("aaa");
    }

    public void bbb() {
        System.out.println("bbb");
    }
    public static void main(String[] args) {
        Central0121 obj = new Central0121();
        obj.aaa();
        obj.bbb();
    }
}