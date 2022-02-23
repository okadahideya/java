public class Method1 {
  public static void main(String[] args) { //エントリーポイント
    // int number1 = 5;
    // int number2 = 10;
    int sum = 0;
    sum = add(20, 30);
    printSum(sum);
    sum = add(5,10);
    printSum(sum);
  }
  public static int add(int number1, int number2) { //voidは戻り値を戻さない状態
    int sum = 0;
    sum = number1 + number2;
    return sum;
    // System.out.println("number1:" + number1);
    // System.out.println("number2:" + number2);
    // System.out.println("sum:" + sum);
  }
  public static void printSum(int sum) {
    System.out.println("sum:" + sum);
  }
    
  
}
