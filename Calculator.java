import java.util.Scanner;

public class Calculator {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String result = "";
        System.out.println("Введите пример:");
        String[] n = in.nextLine().split(" ");
        char operation = n[1].charAt(0);
        if (n[0].matches("\\d+") && n[2].matches("\\d+")) {
            if (Integer.parseInt(n[0]) > 10 || Integer.parseInt(n[2]) > 10) throw new Exception("Входные числа>10");
            result = calc(n[0], n[2], operation);
        } else{
            result = toRoman(Integer.parseInt(calc(toNum(n[0]), toNum(n[2]), operation)));
        }
        System.out.println("Результат операции: " + result);


    }
    public static String toNum(String num) throws Exception{
        switch (num){
            case "I":
                return "1";
            case "II":
                return "2";
            case "III":
                return "3";
            case "IV":
                return "4";
            case "V":
                return "5";
            case "VI":
                return "6";
            case "VII":
                return "7";
            case "VIII":
                return "8";
            case "IX":
                return "9";
            case "X":
                return "10";
            default:
                throw new Exception("Неккоректные входные данные");
        }
    }


    public static String toRoman(int num) throws Exception {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        if (num < 1) throw new Exception("результат меньше 1");
        return roman[num];
    }


    public static String calc(String num1, String num2, char operation) throws Exception {
        switch (operation) {
            case '+':
                return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
            case '-':
                return Integer.toString(Integer.parseInt(num1) - Integer.parseInt(num2));
            case '*':
                return Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2));
            case '/':
                return Integer.toString(Integer.parseInt(num1) / Integer.parseInt(num2));
            default:
                throw new Exception("Некорректный знак действия");
        }
    }
}