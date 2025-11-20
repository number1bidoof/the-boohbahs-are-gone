public class GameDriver {
    public static void main(String[] args) {
        // Enemy e = new Enemy();
        Enemy[] enemies = {
                new Slime(),
                new Skeleton(),
                new Dragon()
        };

        for (Enemy e : enemies) {
            System.out.println("********* " + e.name + " *********");
            e.update();
            e.attack();
            e.takeDamage(2);
            System.out.println(" ");
        }
    }
}
