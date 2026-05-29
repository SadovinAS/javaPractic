class Ex1 extends Exception { }
class Ex2 extends Ex1 { }
class Ex3 extends Ex2 { }
public class Main {
    static void test() throws Ex3 {
        throw new Ex3();
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (Ex3 e) {
            System.out.println("Ex3");
        } catch (Ex2 e) {
            System.out.println("Ex2");
        } catch (Ex1 e) {
            System.out.println("Ex1");
        }
    }
}