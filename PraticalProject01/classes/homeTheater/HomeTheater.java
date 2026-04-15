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
        light.power();
        soundSystem.power();
        projector.power();
    }

    public void startMovieTv() {
        System.out.println("Get ready to watch a movie...");
        light.power();
        soundSystem.power();
        tv.power();
    }

    public void listenToMusic() {
        System.out.println("Get ready to listen to music...");
        light.power();
        soundSystem.power();
    }
}
