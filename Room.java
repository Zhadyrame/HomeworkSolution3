public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    public void display() {
        System.out.println("Room: " + name + " - " + description);
    }
}
