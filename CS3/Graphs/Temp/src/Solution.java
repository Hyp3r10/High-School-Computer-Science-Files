import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        nCr(new BigInteger("" + scan.nextLong()), new BigInteger("" + scan.nextLong()));
    }
    public static void nCr(BigInteger n, BigInteger r) {
        BigInteger ans = BigInteger.ONE, k = BigInteger.ONE;

        if (n.subtract(r).compareTo(r) < 0) {
            r = n.subtract(r);
        }
        if (!r.equals(BigInteger.ZERO)) {
            while (r.compareTo(BigInteger.ZERO) > 0) {
                k.multiply(r);
                ans.multiply(n);
                BigInteger gcd = gcd(ans, k);
                System.out.println(gcd);
                k.divide(gcd);
                ans.divide(gcd);
                r.subtract(BigInteger.ONE);
                n.subtract(BigInteger.ONE);
            }
        }
        else {
            ans = BigInteger.ONE;
        }
        System.out.println(ans.mod(BigInteger.valueOf(1999L)));
    }
    public static BigInteger gcd(BigInteger n1, BigInteger n2) {
        BigInteger gcd = BigInteger.ONE;
 
        for (BigInteger i = BigInteger.ONE; i.compareTo(n1) <= 0 && i.compareTo(n2) <= 0; i.add(BigInteger.ONE)) {
            if (n1.mod(i).equals(BigInteger.ZERO) && n2.mod(i).equals(BigInteger.ZERO)) {
                gcd = i;
            }
            System.out.println(true);
        }
        return gcd;
    }
}