package add_product;

import common.JavafxDB;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddProductController {

	@FXML
	TextField productname;
	
	@FXML
	TextField productquantity;
	
	@FXML
	TextField productprize;
	
	@FXML
	Button addbutton;
	
	@FXML
	Label AddProductErrorMessage;
	
	public void AddProductButtonClicked() throws Exception {
		
		String ProductName = productname.getText();
		String ProductQuantity = productquantity.getText();
		String ProductPrice = productprize.getText();
		
		String query = "Insert into product(name,quantity,price) values ('"+ProductName+"','"+ProductQuantity+"','"+ProductPrice+"')";
		JavafxDB.executeQuery(query);
		
		AddProductErrorMessage.setText("Product added successfully");
		AddProductErrorMessage.setTextFill(Color.GREEN);
	}
}
