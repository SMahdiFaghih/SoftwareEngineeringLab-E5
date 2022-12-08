package Builder;

public class Computer {

    private String HDD;

    public String getHDD() {
        return HDD;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;

    }

    //Builder Class
    public static class ComputerBuilder{

        private String HDD;

        public ComputerBuilder(String hdd){
            this.HDD=hdd;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}