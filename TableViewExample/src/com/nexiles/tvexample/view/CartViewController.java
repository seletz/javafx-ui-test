package com.nexiles.tvexample.view;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.util.Callback;

import com.nexiles.tvexample.MainApp;
import com.nexiles.tvexample.model.Cart;


public class CartViewController {
	
	static final Logger logger = Logger.getLogger(CartViewController.class.getName());
	
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
    	logger.fine("initialize");
    	
    	this.cartList.setCellFactory(new Callback<ListView<Cart>, ListCell<Cart>>() {
    		@Override
    		public ListCell<Cart> call(ListView<Cart> p) {
    			return new CartListCell();
    		}
    	});
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
