package product_management;

import add_product.AddProductScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductManagemnetScreenController {
	
	@FXML
	Button addproduct;
	
	public void AddProductClicked() {
		
		new AddProductScreen().show();
	}

}
