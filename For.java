public class For {
  public static void main(String[] args) {
    for(int i = 0; i <= 10; i++){
      int n  = i + 1;
        if(i == 5){
          continue;  //特定の値の時に次のループに進む
          // break;
        }
      System.out.println("繰り返し:" + n + "周目");
    }
  }
}
