public class Method {
  public static void main(String[] args) { //エントリーポイント
    System.out.println("mainメソッド開始");
    add();
    System.out.println("mainメソッド終了");
  }
  public static void add() {
    int number1 = 5;
    int number2 = 10;
    int sum = 0;
    sum = number1 + number2;
    System.out.println("number1:" + number1);
    System.out.println("number2:" + number2);
    System.out.println("sum:" + sum);
  }
    
  
}
