package PraticalProject01.classes.light;

public class Light {

    private boolean isOn = false;

	public Light() {
	}

    public boolean isOn() {
		return isOn;
	}
    
    public void power() {
        if (isOn) {
            System.out.println("Light is OFF");
            isOn = false;
        } else {
            System.out.println("Light is ON");
            isOn = true;
        }
        
    }
    
}
