import daksh.Sum;
import daksh.Sub;
import daksh.Mul;
import daksh.Div;

public class calc {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sub su = new Sub();
        Mul m = new Mul();
        Div d = new Div();

        int a=10,b=5;

        System.out.println(s.sum(a, b));
        System.out.println(su.sub(a, b));
        System.out.println(m.mul(a, b));
        System.out.println(d.div(a, b));
    }
}
