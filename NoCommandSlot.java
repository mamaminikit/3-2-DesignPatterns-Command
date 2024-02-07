/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class NoCommandSlot implements Control {
    /* No Receiver */
    int slot;

    public NoCommandSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public void on() {
        System.out.println("test one unavailable slot, slot " + slot);
        System.out.println("On button No command is assigned to this slot");
    }

    @Override
    public void off() {
        System.out.println("Off button No command is assigned to this slot");
        System.out.println("-------------------------------");
    }
}
