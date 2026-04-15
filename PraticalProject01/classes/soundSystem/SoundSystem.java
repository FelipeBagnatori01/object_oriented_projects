package PraticalProject01.classes.soundSystem;

public class SoundSystem {

    private boolean isOn = false;

	public SoundSystem() {
	}

    public boolean isOn() {
		return isOn;
	}

    public void power() {
        if (isOn) {
            System.out.println("SoundSystem is OFF");
            isOn = false;
        } else {
            System.out.println("SoundSystem is ON");
            isOn = true;
        }
    }

}
