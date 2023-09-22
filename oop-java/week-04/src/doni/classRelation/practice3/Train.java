package doni.classRelation.practice3;

public class Train {
    private String name;
    private String classType;
    private Employee machinist;
    private Employee assistant;

    public Train(String name, String classType, Employee machinist) {
        this.name = name;
        this.classType = classType;
        this.machinist = machinist;
    }
    public Train(String name, String classType, Employee machinist, Employee assistant) {
        this.name = name;
        this.classType = classType;
        this.machinist = machinist;
        this.assistant = assistant;
    }

    public String info() {
        String info = "";
        info += "Name: " + this.name + "\n";
        info += "Class: " + this.classType + "\n";
        info += "Machinist: " + this.machinist.info() + "\n";
        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info() + "\n";
        } else {
            info += "Assistant: Tidak ada asisten\n";
        }
        return info;
    }
}