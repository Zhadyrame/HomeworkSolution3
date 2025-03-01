public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room roomPrototype = new Room("Generic Room", "A simple empty room");

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Castle of Shadows")
                .addRoom(roomPrototype.cloneEntity())
                .addRoom(roomPrototype.cloneEntity())
                .addRoom(new Room("Boss Room", "A massive hall with a throne"))
                .addNPC(new NPC("Dark Lord", "The ruler of darkness", 500))
                .build();

        dungeon.display();
    }
}
