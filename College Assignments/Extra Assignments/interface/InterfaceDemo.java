interface Camera {
    void clickPhoto();

    static void recordVideo() {
        System.out.println("recording video....");
    }
}

interface Phone {
    void makeCall(String n);

    default void endCall() {
        System.out.println("End call....");
    }
    // we can only use default method in java version 8 or higher.
}

class Smartphone implements Camera, Phone {
    public void clickPhoto() {
        System.out.println("Clicking photo");
    }

    public void makeCall(String n) {
        System.out.println("calling....");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.clickPhoto();
        s.makeCall("100");
        Camera.recordVideo();

    }
}
