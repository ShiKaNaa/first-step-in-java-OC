package hello;

public class Scope {

  public static void main(String[] args) {
    fonctionScope();
  }

  public static void fonctionScope() {
    String scopTesting = "Learning scope of var";
    System.out.println(scopTesting);
  }
}
