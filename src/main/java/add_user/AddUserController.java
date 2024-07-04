package add_user;

import java.sql.SQLException;
import common.JavafxDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserController {
	@FXML
	TextField firstname;

	@FXML
	TextField lastname;

	@FXML
	TextField age;

	@FXML
	TextField gender;

	@FXML
	TextField email;

	@FXML
	TextField mobile;
	
	@FXML
	Label AddUserErrorMessage;
	
	public void AddUserDetailsClicked() throws SQLException  {
		String Firstname = firstname.getText();
		String Lastname = lastname.getText();
		String Age = age.getText();
		String Gender = gender.getText();
		String Email = email.getText();
		String Mobile = mobile.getText();
		
		String query = "Insert into user(firstname,lastname,age,gender,email,mobile) values ('"+Firstname+"','"+Lastname+"','"+Age+"','"+Gender+"','"+Email+"','"+Mobile+"')";
		JavafxDB.executeQuery(query);
		
		AddUserErrorMessage.setText("User added successfully");
		AddUserErrorMessage.setTextFill(Color.GREEN);
		
	}

	
}
