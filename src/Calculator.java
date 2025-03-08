import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        char operator, choice;
        System.out.println("请输入第一个数字");
        number1 = input.nextInt();
        System.out.println("请输入运算符");
        operator = input.next().charAt(0);
        System.out.println("请输入第二个数字");
        number2 = input.nextInt();

        switch (operator) {
            case '+':
                System.out.println("结果是" + number1 + number2);
                break;
                case '-':
                    System.out.println("结果是"+ (number1 - number2));
                    break;
                    case '*':
                        System.out.println("结果是" + number1 * number2);
                        break;
                        case '/':
                            if (number2 == 0) {
                                System.out.println("除数不能为0，请重新输入非0数！");
                            } else {
                                System.out.println("结果是" + number1 / number2);
                            }
                            break;
                            case '%':
                                if (number2 == 0) {
                                    System.out.println("除数不能为0，请重新输入非0数！");
                                } else {
                                    System.out.println("结果是" + number1 % number2);
                                }
                                break;
                            default:
                                System.out.println("无效的运算符，请重新输入！");
                                break;

                                
        }
        input.close();
    }
}
