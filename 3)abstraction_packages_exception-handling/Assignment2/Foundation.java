public class Foundation {

    private int var1;
    int var2;
    protected int var3;
    public int var4;

    public Foundation(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getVar3() {
        return var3;
    }

    public int getVar4() {
        return var4;
    }

    public static void main(String[] args) {
        Foundation foundationObj = new Foundation(1, 2, 3, 4);

        // Accessing public variable var4
        System.out.println("var4: " + foundationObj.getVar4());

        // Accessing protected variable var3
        System.out.println("var3: " + foundationObj.getVar3());

        // Accessing default variable var2
        System.out.println("var2: " + foundationObj.getVar2());

        // Trying to access private variable var1. This will result in a compile-time error
        // System.out.println("var1: " + foundationObj.getVar1());
    }
}