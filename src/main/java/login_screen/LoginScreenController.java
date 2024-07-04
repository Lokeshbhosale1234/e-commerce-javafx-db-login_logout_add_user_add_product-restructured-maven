package login_screen;

import java.sql.ResultSet;

import common.JavafxDB;
import home_screen.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	
	@FXML
	TextField username;
	
	@FXML
	TextField password;
	
	@FXML
	Label errormessage;
	
	public void loginButtonClicked() throws Exception{
		
		String Username = username.getText();
		String Password = password.getText();

		String query = "SELECT * FROM login WHERE username='" + Username + "' AND password = '" + Password + "'";
		ResultSet resultset = JavafxDB.executeSelectQuery(query);

		if (resultset.next()) {
			errormessage.setText("Login Success");
			errormessage.setTextFill(Color.GREEN);
			
			new HomeScreen().show();
			
		} else {
			errormessage.setText("Login failed");
			errormessage.setTextFill(Color.RED);
		}
	}


}
