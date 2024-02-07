/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.ArrayList;
import java.util.List;

public class Order { /* Invoke */
    private List<Control> orderList = new ArrayList<>();
    public void addOrder(Control control) {
        orderList.add(control);
    }

    public void cancelOrder(Control control){
        if (orderList.size() != 0)
            orderList.remove(orderList.indexOf(orderList));
    }

    public void startControl() { /* Call The Command */
        for (Control order : orderList) {
            order.on();
            order.off();
        }
    }
}
