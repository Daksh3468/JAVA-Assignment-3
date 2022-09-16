import java.util.Vector;
interface Iprinter {
    public void iprinter();
}
interface Iscanner {
    public void iscanner();
}
class Concrete implements Iprinter, Iscanner {
    public void iprinter() {
        System.out.println("Print Iprinter");
    }
    public void iscanner() {
        System.out.println("Print Iscanner");
    }
}
public class pr3_2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Concrete c1 = new Concrete();
        Concrete c2 = new Concrete();
        Concrete c3 = new Concrete();
        Concrete c4 = new Concrete();
        Concrete c5 = new Concrete();

        v.add(c1);
        v.add(c2);
        v.add(c3);
        v.add(c4);
        v.add(c5);
        
        // for (int i = 0; i < 5; i++) {
        //     v.add(c[i]);
        // }
        System.out.println(v);
        for (int i = 0; i < 5; i++) {
            Concrete c6 = (Concrete) v.get(i);
            c6.iprinter();
            c6.iscanner();
        }
    }
}
