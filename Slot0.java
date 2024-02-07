/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Slot0 implements Control {
    private Light light; /* get Receiver */
    boolean on = false;

    public Slot0(Light light) {
        this.light = light;
    }

    @Override
    public void on() {
        System.out.println("slot 0, light " + light.getRoomName());
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
