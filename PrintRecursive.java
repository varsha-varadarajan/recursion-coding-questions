/* Print numbers from 1 to N using recursion
*/

public class PrintRecursive {
    void printOneToN(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        
        printOneToN(n-1);
        System.out.print(" " + n);
    }
    
    void printNToOne(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        
        System.out.print(n + " ");
        printNToOne(n-1);
    }
}

class PrintRecursiveDriver {
    public static void main(String[] args) {
        PrintRecursive p = new PrintRecursive();
        p.printOneToN(5);
        System.out.println();
        p.printNToOne(5);
    }
}