
package notes;

/**
 *
 * @author garipa01
 */
public class UnitTesting {
    public static void main(String[] args){
        int n = 6;
        boolean result = isEven(n);
        System.out.println(result);
    }


    public static boolean isEven(int n){
        return (n % 2 == 0);
    }
}
