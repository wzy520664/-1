package Fwp;

public class Switch implements NetworkDevice {
    private String type;
    public Switch(String type){
        this.type = type;
    }
    @Override
    public String getTYpe() {
        return this.type;
    }

    public void use(){
        System.out.println("Linked by switch,type is " + this.type);
    }

}
