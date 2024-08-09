import java.util.Scanner;

public class AplicationChampion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life1 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor1 = sc.nextInt();

        Champion champion1 = new Champion(name1, life1, attack1, armor1);

        sc.nextLine(); // Consumir a linha pendente

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        Champion champion2 = new Champion(name2, life2, attack2, armor2);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int turns = sc.nextInt();

        for (int i = 1; i <= turns; i++) {
            champion1.takeDamage(champion2.getAttack());
            champion2.takeDamage(champion1.getAttack());

            System.out.println("\nResultado do turno " + i + ":");
            System.out.println(champion1.status());
            System.out.println(champion2.status());

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }
        }

        System.out.println("\nFIM DO COMBATE");
        sc.close();
    }
}