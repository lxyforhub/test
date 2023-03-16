package package1;

import java.util.GregorianCalendar;
import java.util.Optional;

public class Car extends Vehicle {

    String type;

    public int countFee() {
        return this.getFee_hour() * this.getHour();
    }

    public void setFee_hour() {
        if (this.type.equals("luxurious")) {
            this.fee_hour = 10;
        } else {
            this.fee_hour = 5;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String id, GregorianCalendar in,String type) {
        super(id, in);
        this.type = type;
    }
    public void print(){
        System.out.println("车牌号："+this.getId());
        System.out.println("进入时间："+this.getIn());
        System.out.println("离开时间："+this.getOut());
        System.out.println("车辆类型："+this.getType());
    }
}
