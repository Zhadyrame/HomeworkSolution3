public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark and eerie entrance"))
                .addRoom(new Room("Treasure Room", "A room full of treasure"))
                .addNPC(new NPC("Goblin", "A sneaky little goblin", 5))
                .build();

        dungeon.display();
    }
}
