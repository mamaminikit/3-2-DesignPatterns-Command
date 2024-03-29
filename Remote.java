/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Remote {
    public static void main(String[] args) {
        /* Identify Receiver */
        Light lightSlot0 = new Light("Bed Room");
        Light lightSlot1 = new Light("Kitchen");
        AirConditioner acSlot2 = new AirConditioner("Bed Room");
        /* Create Concrete Command */
        Slot0 slot0 = new Slot0(lightSlot0);
        Slot1 slot1 = new Slot1(lightSlot1);
        Slot2 slot2 = new Slot2(acSlot2, 25);
        NoCommandSlot slot3 = new NoCommandSlot(3);
        NoCommandSlot slot4 = new NoCommandSlot(4);
        NoCommandSlot slot5 = new NoCommandSlot(5);
        /* Call operation through Invoke */
        Order order = new Order();
        order.addOrder(slot0);
        order.addOrder(slot1);
        order.addOrder(slot2);
        order.addOrder(slot3);
        order.addOrder(slot4);
        order.cancelOrder(slot4);
        order.startControl(); /* Postpone called the operation */
    }
}
