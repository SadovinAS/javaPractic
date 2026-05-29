public class Outer {
    private class InnerPrivate {
        void show() { System.out.println("InnerPrivate"); }
    }
    class InnerDefault {
        void show() { System.out.println("InnerDefault"); }
    }
    protected class InnerProtected {
        void show() { System.out.println("InnerProtected"); }
    }
    public class InnerPublic {
        void show() { System.out.println("InnerPublic"); }
    }
    void test() {
        new InnerPrivate().show();     // доступно внутри Outer
        new InnerDefault().show();     // доступно внутри Outer
        new InnerProtected().show();   // доступно внутри Outer
        new InnerPublic().show();      // доступно внутри Outer
    }
}
