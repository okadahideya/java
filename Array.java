public class Array {
  public static void main(String[] args) {
    String name =  "日本太郎";
    String email = "nihon@gmail.com";
    String phone = "000-0000-0000";

    String[] customer;  //配列の宣言
    customer = new String[3]; //初期化
    customer[0] = name;
    customer[1] = email;
    customer[2] = phone;

    // String[] customer2;
    // customer2 = new String[]{"太郎","nihon@gmail.com","000-0000-0000"};

    // String[] customer2 = {"太郎","nihon@gmail.com","000-0000-0000"};


    // for(int i=0; i<customer.length; i++){
    //   System.out.println(customer[i]);
    // }

    for(String info : customer){
      System.out.println(info);
    }


  }
}
