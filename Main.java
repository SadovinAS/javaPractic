public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world"); // append() — добавление в конец строки
        System.out.println(sb);
        sb.delete(5, 11); // delete() — удаление части строки
        System.out.println(sb);
        sb.insert(5, " World"); // insert() — вставка по индексу
        System.out.println(sb);
        sb.replace(6, 11, " wrd "); // replace() — замена части строки
        System.out.println(sb);
        sb.deleteCharAt(4); // deleteCharAt() — удаление символа по индексу
        System.out.println(sb);
        sb.reverse(); // reverse() — переворот строки
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.charAt(1)); // charAt() — получение символа
        sb.setCharAt(0, 'h'); // setCharAt() — изменение символа
        System.out.println(sb);
        System.out.println(sb.length()); // length() — длина строки
        System.out.println(sb.capacity()); // capacity() — размер внутреннего буфера
        System.out.println(sb.substring(0, 5)); // substring() — получение подстроки
    }
}