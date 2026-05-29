

class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Outer.InnerPrivate ip = outer.new InnerPrivate(); // не доступно
        Outer.InnerDefault id = outer.new InnerDefault();    // доступно в том же пакете
        Outer.InnerPublic ipu = outer.new InnerPublic();     //доступно

        id.show();
        ipu.show();
    }
}