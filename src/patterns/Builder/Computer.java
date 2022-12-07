package patterns.Builder;

public class Computer {
    private String RAM;
    private boolean bluetooth;
    private String storage;
    private String GPU;
    private String CPU;
    private String audio;

    private Computer(){};

    private Computer(Builder builder)
    {
        //this.RAM = Builder.RAM;
        //this.bluetooth = Builder.b;
    }

    static public class Builder {
        private String RAM;
        private boolean bluetooth;
        private String storage;
        private String GPU;
        private String CPU;
        private String audio;

        public Builder(String RAM) {
            this.RAM = RAM;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setAudio(String audio) {
            this.audio = audio;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }
    }
}
