package Fwp;

public class Hub implements NetworkDevice {
    private String type;
    public Hub(String type){
        this.type = type;
    }

    @Override
    public String getTYpe() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub,type is " + this.type);

    }
}