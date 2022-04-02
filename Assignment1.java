package src;
import java.lang.Math;
import java.util.Scanner;

interface intRes {
    int count();
}
interface dblRes {
    double count();
}
interface wrdRes {
    String count();
}
interface voidRes {
    void count();
} // different types of answers
class P {
    int n = 0;
    double nd = 0;
}
class T extends P {
    int tmp = 0;
    double tmd = 0;
} // additional variables


class P1 extends T implements intRes {
    public int count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        tmp = s.nextInt();
        int min = tmp;
        for (int i = 1; i < n; i++) {
            tmp = s.nextInt();
            if (min > tmp)
                min = tmp;
        }
        return min;
    }
    public static void main(String[] args) {
        P1 a = new P1();
        System.out.println(a.count());
    }
}
class P2 extends T implements dblRes {
    public double count () {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        double avg = 0;
        for (int i = 0; i < n; i++) {
            tmd = s.nextDouble();
            avg += tmd;
        }
        return avg / n;
    }
    public static void main(String[] args) {
        P2 a = new P2();
        System.out.println(a.count());
    }
}
class P3 extends P implements wrdRes {
    public String count () {
        Scanner s = new Scanner(System.in);
        nd = s.nextDouble();
        for (double i = 2; i < Math.sqrt(nd); i++) {
            if (Math.floor(nd / i) == nd / i) {
                return "Composite";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        P3 a = new P3();
        System.out.println(a.count());
    }
}
class P4 extends P implements intRes {
    public int factorial (int n) {
        return ((n == 0) ? 1 : factorial(n - 1) * n);
    }
    public int count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        return factorial(n);
    }
    public static void main(String[] args) {
        P4 a = new P4();
        System.out.println(a.count());
    }
}
class P5 extends P implements intRes {
    public int fibonacci (int n) {
        return ((n < 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2));
    }
    public int count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        return fibonacci(n - 1);
    }
    public static void main(String[] args) {
        P5 a = new P5();
        System.out.println(a.count());
    }
}
class P6 extends P implements intRes {
    int a = 0;
    public int powerofN (int a, int n) {
        return ((n < 1) ? 1 : powerofN(a, n - 1) * a);
    }
    public int count() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        n = s.nextInt();
        return powerofN(a, n);
    }
    public static void main(String[] args) {
        P6 a = new P6();
        System.out.println(a.count());
    }
}
class P7 extends P implements voidRes {
    /*
        I do not really understand why but
        the program does not work when the input is in one line (4 1 4 6 2 or 4\n1 4 6 2)
        it only works with 4\n1\n4\n6\n2
        I am guessing it is due to how .nextInt works
        the concept of the program still works
    */
    void reverseOrder (int n) {

        if (n < 1) return;
        Scanner s = new Scanner(System.in);
        int tmp = s.nextInt();
        reverseOrder(n - 1);
        System.out.println(tmp + " ");
        return;
    }
    public void count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        reverseOrder(n);
    }
    public static void main(String[] args) {
        P7 a = new P7();
        a.count();
    }
}
class P8 extends P implements wrdRes {
    public String checkChar (String str) {
        if (str.charAt(0) > '9' || str.charAt(0) < '0')
            return "No";
        if (str.length() == 1)
            return "Yes";
        return checkChar(str.substring(1));
    }
    public String count() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        return checkChar(str.trim());
    }
    public static void main(String[] args) {
        P8 a = new P8();
        System.out.println(a.count());
    }
}
class P9 extends T implements intRes {
    public int binomial (int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    public int count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        tmp = s.nextInt();
        return binomial (n, tmp);
    }
    public static void main(String[] args) {
        P9 a = new P9();
        System.out.println(a.count());
    }
}
class P10 extends T implements intRes {
    public int findgcd (int a, int b) {
        if (a == 0)
            return b;
        return findgcd(b % a, a); // had to look up theoretical solution
    }
    public int count() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        tmp = s.nextInt();
        return findgcd(n, tmp);
    }
    public static void main(String[] args) {
        P10 a = new P10();
        System.out.println(a.count());
    }
}

public class Assignment1 {

}
