package FirstAss;

public class Obj2 {
    public static void main(String[] args){
        int[] a = {10,20,30};
        int[] b = a;
        a[0] = 40;

        System.out.println(b[0]);

    }
}
