package hello;

public class AccesControl {

  public static void main(String[] args) {
    System.out.println(Exo.text);
  }

}

class Exo {

  static String text = "accessing from another class";

  static void printText() {
    System.out.println(text);
  }

}
