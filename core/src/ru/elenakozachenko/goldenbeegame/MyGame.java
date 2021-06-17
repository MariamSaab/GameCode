package ru.elenakozachenko.goldenbeegame;

import com.badlogic.gdx.Game;

import ru.elenakozachenko.goldenbeegame.loader.ResourseLoader;
import ru.elenakozachenko.goldenbeegame.screens.SplashScreen;

public class MyGame  extends Game {


	@Override
	public void create () {
		ResourseLoader.load();
		setScreen(new SplashScreen(this));

	}

	@Override
	public void dispose() {
		super.dispose();
		ResourseLoader.dispose();
	}
}
