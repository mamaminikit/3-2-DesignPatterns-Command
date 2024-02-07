/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Slot3 implements Control {
    /* No Receiver */
    @Override
    public void on() {
        System.out.println("test one unavailable slot, slot 3");
        System.out.println("On button No command is assigned to this slot");
    }

    @Override
    public void off() {
        System.out.println("Off button No command is assigned to this slot");
        System.out.println("-------------------------------");
    }
}
