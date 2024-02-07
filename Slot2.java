/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Slot2 implements Control {
    AirConditioner air; /* get Receiver */
    boolean on = false;
    int temp;

    public Slot2(AirConditioner air, int temp) {
        this.air = air;
        this.temp = temp;
    }

    @Override
    public void on() {
        System.out.println("Slot2, AC " + air.getRoomName());
        air.on();
        air.setTemp(temp);
        on = true;
    }

    @Override
    public void off() {
        if (on) {
            air.off();
        }
        System.out.println("-------------------------------");
    }
} /* CONCRETE COMMAND */
