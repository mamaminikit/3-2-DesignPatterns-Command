/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Slot1 implements Control{
    Light light; /* get Receiver */
    boolean on = false;

    public Slot1(Light light) {
        this.light = light;
    }

    @Override
    public void on() {
        System.out.println("Slot1, light " + light.getRoomName());
        light.on();
        on = true;
    }

    @Override
    public void off() {
        if (on) {
            light.off();
        }
        System.out.println("-------------------------------");
    }
} /* CONCRETE COMMAND */
