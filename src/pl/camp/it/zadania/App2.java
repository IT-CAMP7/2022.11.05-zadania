package pl.camp.it.zadania;

public class App2 {
    public static void main(String[] args) {
        String s = " jaKis ";
        String lower = s.toLowerCase();

        System.out.println(s);
        System.out.println(lower);

        System.out.println(s.equals(lower));

        System.out.println(s.strip());
        System.out.println(s.stripTrailing());
        System.out.println(s.stripLeading());
        System.out.println(s.stripIndent());
    }
}
