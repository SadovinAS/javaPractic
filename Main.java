
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // new Outer.InnerPrivate();  // недоступно всегда
        new Outer().new InnerDefault();   // доступно в том же пакете, не доступно в другом
        new Outer().new InnerProtected(); // доступно если подкласс или в пакете, не доступно иначе
        new Outer().new InnerPublic();    // доступно всегда
    }
}