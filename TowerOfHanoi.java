public class TowerOfHanoi {
    int count = 0;
    void toh(int n, String src, String dest, String helper) {
        count++;
        if (n == 1) {
            System.out.println("Move disk " + n + " from (" + src + ") to " + "(" + dest + ")");
            return;
        }
        
        toh(n-1, src, helper, dest);
        System.out.println("Move disk " + n + " from (" + src + ") to " + "(" + dest + ")");
        toh(n-1, helper, dest, src);
    }
}

class Driver {
    public static void main(String[] args) {
        TowerOfHanoi t = new TowerOfHanoi();
        t.toh(3, "1", "2", "3");
        System.out.println("Moves:" + t.count);
    }
}