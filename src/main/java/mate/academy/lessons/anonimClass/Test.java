package mate.academy.lessons.anonimClass;

interface Animal {
    public void eat () ;
}




public class Test {
    public static void main(String[] args) {

       ((Animal) () -> { System.out.println("Hello"); }).eat();

       new Animal() {
           @Override
           public void eat() {
               System.out.println("By");
           }
       };
    }

}
