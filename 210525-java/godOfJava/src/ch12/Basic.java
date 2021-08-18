package ch12;

public class Basic {
    public static void main(String[] args) {
        Basic basic = new Basic();
        Basic basic2 = new Basic();
        System.out.println(basic.getClass());
        System.out.println(Integer.toHexString(basic.hashCode()));
        System.out.println(basic.equals(basic2));


        System.out.println(">>>");
        basic.print(basic);
        basic.print();

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private void print() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }

    private void print(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
}
