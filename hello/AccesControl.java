package hello;

public class AccesControl {

  public static void main(String[] args) {
    Exo.printText();
  }

}

class Exo {

  static String text = "accessing from another class";

  // si on met private devant static String... il y aura une erreur car la var text est uniquement disponible dans cette class
  // si on met public la variable est disponible pour d'autres class

  static void printText() {
    System.out.println(text);
  }

  // on peut mettre ici aussi private pour interdir l'acces à la fonction par les autres class

}
