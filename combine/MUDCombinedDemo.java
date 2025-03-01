public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room roomPrototype = new Room("Generic Room", "simple empty room");

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Castle of Shadows")
                .addRoom(roomPrototype.cloneEntity())
                .addRoom(roomPrototype.cloneEntity())
                .addRoom(new Room("Boss Room", "A massive hall  throne"))
                .addNPC(new NPC("Dark Lord", "The ruler of darkness", 50))
                .build();

        dungeon.display();
    }
}
