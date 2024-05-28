import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityScheduler {
    private PriorityQueue<Schedule> scheduleQueue;

    public PriorityScheduler() {
        this.scheduleQueue = new PriorityQueue<>();
    }

    public void terimaCucian(int id, String name, int date, String type, int weight) {
        this.scheduleQueue.add(new Schedule(id, type, name, date, weight));
    }

    public Schedule getNextSchedule() {
        return this.scheduleQueue.poll();
    }

    public void listJadwal() {
        List<Schedule> schedules = new ArrayList<>();

        while (!this.scheduleQueue.isEmpty()) {
            schedules.add(this.scheduleQueue.poll());
        }

        for (Schedule schedule : schedules) {
            System.out.println(schedule);
        }
    }
}
