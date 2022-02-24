package jp.co.funatz.pkgTest;
import  jp.co.funatz.pkgTest.a.PackageA;  //*を使用することで、aフォルダ全て読み込み可能
import  jp.co.funatz.pkgTest.b.PackageB;


public class Package {
  public static void main(String[] args) {
    PackageA.a();  //FQCNで指定
    PackageB.b();
  }
}
