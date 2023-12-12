import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nums = {};
        char operator;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] strch = str.toCharArray();

        boolean flag = false;
        String num1;
        String num2;
        for(char ch : strch) {
            if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/') && flag == false)
                num1 = num1 + ch;
                else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                switch (ch) {
                    case '+':
                        operator = '+';
                        continue;
                    case '-':
                        operator = '-';
                        continue;
                    case '*':
                        operator = '*';
                        continue;
                    case '/':
                        operator = '/';
                        continue;
                }}
            }
            else if
        }
        System.out.println("strings.l" + strings.length);
        System.out.println("operator.l" + operator.length);
        for(String s : strings) {
            System.out.println(s + ',');
        }
        for(String s : operator) {
            System.out.println(s + ',');
        }
    }
}
