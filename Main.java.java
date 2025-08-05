import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      String Superhero;
      String Adjective;
      String Power;
      String Villian;
      String Object;
      String City;
      String Noise;
      String Emotion;
      String Sidekick;
      String Final;

        System.out.print("Enter the superhero name:");
        Superhero= scanner.nextLine();
        System.out.print("Enter the adjective (quality):");
        Adjective= scanner.nextLine();
        System.out.print("Enter the power that superhero possed:.");
        Power= scanner.nextLine();
        System.out.print("Enter the name of might villian:");
        Villian= scanner.nextLine();
        System.out.print("enter the name of object:");
        Object= scanner.nextLine();
        System.out.print("enter the city which chaos erupted:");
        City= scanner.nextLine();
        System.out.print("enter the noise that came:");
        Noise= scanner.nextLine();
        System.out.print("enter the emotion that hero felt:");
        Emotion= scanner.nextLine();
        System.out.print("enter the sidekick name:");
        Sidekick= scanner.nextLine();
        System.out.print("enter the final move:");
        Final= scanner.nextLine();


        System.out.println("\nIn the busting city of "  + City +  " chaos reigned. " );
        System.out.println("Untill one brave soul stepped forward."  + Superhero +  " " +  Adjective +  " defender of truth and justice!" );
        System.out.println(" Armed with the power of "  + Power +  " they zoomed through the skies");
        System.out.println("determined to take down the evil "  + Villian );
        System.out.println("The villain had stolen a mystical "  + Object + " that could bend time itself.");
        System.out.println("With a loud "  +  Noise + " "  +  Superhero  + " flew into action,fueled by "  + Emotion +  " and a deep love for city.");
        System.out.println("Alongside their trusty sidekick,"  + Sidekick +  " they burst into villian lair.");
        System.out.println("In a final epic showdown "  + Superhero);
        System.out.println("unleashed their legendary "  + Final +  " battle move and saved the world.");
        System.out.println("Cheers erupted across "  + City +  " he galaxy was safe once more!");

        scanner.close();
    }
}




