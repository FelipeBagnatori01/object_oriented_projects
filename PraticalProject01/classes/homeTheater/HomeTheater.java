package PraticalProject01.classes.homeTheater;

import PraticalProject01.classes.light.Light;
import PraticalProject01.classes.projector.Projector;
import PraticalProject01.classes.soundSystem.SoundSystem;
import PraticalProject01.classes.tv.Tv;

public class HomeTheater {
    private Tv tv;
    private Projector projector;
    private SoundSystem soundSystem;
    private Light light;

    public HomeTheater() {
        this.tv = new Tv();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.light = new Light();
    }

    public void startMovieCinema() {
        System.out.println("Get ready to watch a movie...");
        if(light.isOn()) {
            light.power();
        }
        if (!soundSystem.isOn()){
            soundSystem.power();
        }
        if (!projector.isOn()){
            projector.power();
        }
    }

    public void endMovie() {
        System.out.println("Shutting down the cinema...");
        if (light.isOn()) light.power();
        if (soundSystem.isOn()) soundSystem.power();
        if (projector.isOn()) projector.power();
        if (tv.isOn()) tv.power();
    }

    public void startMovieTv() {
        System.out.println("Get ready to watch a movie on Tv");
        if(!light.isOn()) {
            light.power();
        }
        if (!soundSystem.isOn()) {
            soundSystem.power();
        }
       if (!tv.isOn()) {
            tv.power();
        }
    }

    public void listenToMusic() {
        System.out.println("Get ready to listen to music...");

        if (!light.isOn()) light.power();
        
        if (!soundSystem.isOn()) soundSystem.power();
    }
}
