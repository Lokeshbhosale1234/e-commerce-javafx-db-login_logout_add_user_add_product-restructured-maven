package ecommerce;

import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import login_screen.LoginScreen;

public class ECommerceMain extends Application{
	
	public static void main(String args[] ) {
		launch(args);
	}

	@Override
	public void start(Stage stageCreatedByJavaFx) throws Exception{
		
		StageHolder.stage = stageCreatedByJavaFx;
		StageHolder.stage.setTitle("E-Commerce Application");
		new LoginScreen().show();
		
	}

}
