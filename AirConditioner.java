/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class AirConditioner {
    private String roomName;
    public AirConditioner(String roomName) {
        this.roomName = roomName;
    }
    public void on() {
        System.out.println("The AC is on... in " + roomName);
    }
    public void setTemp(int temp) {
        System.out.println("The temp is set to " + temp + " in " + roomName);
    }
    public void off() {
        System.out.println("The AC is off... in " + roomName);
    }

    public String getRoomName() {
        return roomName;
    }
} /* RECEIVE */
