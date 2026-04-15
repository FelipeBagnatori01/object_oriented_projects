package PraticalProject01.classes.projector;

public class Projector {

    private boolean isOn = false;

	public Projector() {
	}

    public boolean isOn() {
		return isOn;
	}

    public void power() {
        if (isOn) {
            System.out.println("Projector is OFF");
            isOn = false;
        } else {
            System.out.println("Projector is ON");
            isOn = true;
        }
    }

}
