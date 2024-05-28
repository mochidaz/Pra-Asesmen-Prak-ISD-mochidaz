public class Schedule implements Comparable<Schedule> {
    private int id;
    private String type;
    private String name;
    private int date;
    private int weight;

    public Schedule(int id, String type, String name, int date, int weight) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.weight = weight;
    }

    public int duration() {
        switch (type) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            default:
                return 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return this.date;
    }

    public int getweight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "id cucian: " + this.id + "\n" + "nama pelanggan: " + this.name + "\n";
    }

    @Override
    public int compareTo(Schedule other) {
        int result = this.duration() + this.date;
        int otherResult = other.duration() + other.date;
    
        if (result < otherResult) {
            return -1;
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }
}


