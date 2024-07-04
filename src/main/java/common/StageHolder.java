package common;

import javafx.stage.Stage;

public class StageHolder {
	
	public static Stage stage;
	
	public static Stage getStage() {
		return stage;
		
	}
	
	public static void getStage(Stage stage) {
		StageHolder.stage = stage;
	}

}
