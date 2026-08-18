package Yashavantha;

class GrandParent {
    void bp() {
        System.out.println("understand bp");
    }
}
class Parent extends GrandParent {
    void cancer() {
        System.out.println("understand cancer");
    }
}

public class Hierarchical extends GrandParent {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.bp();
        p.cancer();

        Hierarchical bb = new Hierarchical();
        bb.bp();
    }
}