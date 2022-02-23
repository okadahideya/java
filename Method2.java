public class Method2 {
  public static void main(String[] args) { //エントリーポイント
    int intSum = 0;
    double doubleSum = 0;
    if(2 == args.length){
      intSum = add(Integer.parseInt(args[0]), Integer.parseInt(args[1])); //String型からint型に変換
      printSum(intSum);
    }else{
      System.out.println("値は二つ必要です。再度入力してください");
    }
    // sum = add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    // printSum(sum);
    doubleSum = add(5.5,10.0);
    printSum(doubleSum);
  }
  public static int add(int number1, int number2) { //voidは戻り値を戻さない状態
    int sum1 = 0;
    sum1 = number1 + number2;
    return sum1;
  }
  public static double add(double number1, double number2) { //型に注意
    double sum1 = 0;
    sum1 = number1 + number2;
    return sum1;
  }
  public static void printSum(int sum) {
    System.out.println("sum:" + sum);
  }
  public static void printSum(double sum) {
    System.out.println("sum:" + sum);
  }
}
