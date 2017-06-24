package emulator;

import emulator.Levels.Loader;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String... args) {
        GameView gameView = new GameView();
        try {
            gameView.physEngine = new PhysEngine(
                    new Loader(
                            new File(
                                    "/home/stas/IdeaProjects/gravitydefied/assets/levels.mrg"
                            )
                    )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        PhysEngine engine = gameView.physEngine;
        engine.setLeague(1);
        engine._doZV(true);
        engine.updateRiderElements();
        engine._dovI();
        while(true) {

        }
    }
}
