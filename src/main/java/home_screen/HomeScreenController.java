package home_screen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login_screen.LoginScreen;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class HomeScreenController {
	
	@FXML
	Button productmanagement;
	
	@FXML
	Button usermanagement;
	
	@FXML
	Button logout;
	
	public void ProductManagementClicked(){
		
		new ProductManagementScreen().show();
		
		
	}
	
	public void UserManagementClicked(){
		
		new UserManagementScreen().show();
		
	}
	
	public void logoutClicked(){
		
		new LoginScreen().show();
	}

}
