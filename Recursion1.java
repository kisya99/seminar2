package seminar2;

public class Recursion1 {
    public static void main(String[] args) {
        findPath(3, 10, 2, 2, "");
    }
    //k1 сложение
    //k2 умножение

    public static void findPath(int source, int target, int addend, int multiplier, String path){
        if (source > target) return;
        if (source == target){
            System.out.println(path);
            return;
        }
        findPath(source + addend, target, addend, multiplier, path + "k1");
        findPath(source  * addend, target, addend, multiplier, path + "k2");

    }
}
