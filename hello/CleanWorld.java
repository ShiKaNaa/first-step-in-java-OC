// package cleanHello;

// public class CleanHello {

//   public static void main(String[] args) {
//     sayHelloTo("world");
//   }

//   private static void sayHelloTo(String recipient) {
//     System.out.println("Hello " + recipient);
//   }

// }

package CleanWorld;

/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class CleanWorld {

   /** Le programme commence ici */
   public static void main(String[] args) {
      sayHelloTo("world");
   }

   /** affiche le message "hello" au destinataire fourni
   *
   * @param recipient
   */
   private static void sayHelloTo(String recipient) {
      System.out.println("Hello " + recipient);
   }

}
