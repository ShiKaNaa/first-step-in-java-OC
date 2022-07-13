package hello;

public class Scope {

  static String scopTesting = "Learning scope of var";

  public static void main(String[] args) {
    fonctionScope();
  }

  public static void fonctionScope() {
    System.out.println(scopTesting);
  }

}
