public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Hallway", "A long  corridor");
        Room clonedRoom = originalRoom.cloneEntity();

        NPC originalNPC = new NPC("Orc", "A big, green monster", 10);
        NPC clonedNPC = originalNPC.cloneEntity();

        clonedRoom.display();
        clonedNPC.display();
    }
}
