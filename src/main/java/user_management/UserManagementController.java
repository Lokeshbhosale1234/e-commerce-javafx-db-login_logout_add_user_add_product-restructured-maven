package user_management;

import add_user.AddUserScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserManagementController {
	
	@FXML
	Button adduser;
	
	public void AddUserClicked(){
		
		new AddUserScreen().show();
	}

}
