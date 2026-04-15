package PraticalProject01.classes.tv;

public class Tv {

    private boolean isOn = false;

	public Tv() {
	}

    public boolean isOn() {
		return isOn;
	}

    public void power() {
        if (isOn) {
            System.out.println("Tv is OFF");
            isOn = false;
        } else {
            System.out.println("Tv is ON");
            isOn = true;
        }
    }



}
