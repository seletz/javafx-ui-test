package com.nexiles.tvexample.view;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;

import com.nexiles.tvexample.MainApp;
import com.nexiles.tvexample.model.Cart;

public class CartViewController {
	
	@FXML
	private ListView<Cart> cartList;
	
	@SuppressWarnings("unused")
	private MainApp mainApp;
	
	public CartViewController() {
	}
	
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        cartList.setItems(mainApp.getCartItems());
    }
}
