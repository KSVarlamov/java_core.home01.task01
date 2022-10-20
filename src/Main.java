public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*
         В этой строке будет происходить падение, ибо devide не проверят деление на ноль.
         Чтобы исправить, нужно добавить соответствующую проверку.
         Альтернативный метод деления добавлен в Calculator (safeDivide(a, b))
         */

        int c = calc.divide.apply(a, b);

        //int c = calc.safeDivide.apply(a, b);

        calc.println.accept(c);
    }
}