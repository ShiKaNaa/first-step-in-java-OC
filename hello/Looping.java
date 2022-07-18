package hello;

public class Looping {

  public static void main(String[] args) {

    for(int i = 0; i <= 25; i++) {
      bonjour(Integer.toString(i));
    }



  }

  static void bonjour(String nom) {
    System.out.println("Bonjour " + nom + " !");
  }

  static int randomNumber() {
    return (int) ((Math.random() * ((100 - 1) + 1 )) + 1);
  }

}
