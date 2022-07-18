package hello;

public class ControlFlow {

  public static void main(String[] args) {

    if(getBoolean()) {
      print("if");
    } else {
      print("else");
    }

  }

  static void print(String text) {
    System.out.println("Condition : " + text);
  }

  static boolean getBoolean() {
    return true;
  }

}
