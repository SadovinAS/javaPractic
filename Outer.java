public class Outer {
    private class InnerPrivate {
        private int x = 10;
        private void show() {
            System.out.println(x);
        }
    }

    class InnerDefault {
        int y = 20;
        void show() {
            System.out.println(y);
        }
    }

    public class InnerPublic {
        int z = 30;
        void show() {
            System.out.println(z);
        }
    }

    void accessInner() {
        InnerPrivate ip = new InnerPrivate();
        ip.show(); // доступно
        InnerDefault id = new InnerDefault();
        id.show(); // доступно
        InnerPublic ipu = new InnerPublic();
        ipu.show(); // достпуно
    }
}