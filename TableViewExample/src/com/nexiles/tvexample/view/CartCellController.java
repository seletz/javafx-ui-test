/**
 * 
 */
package com.nexiles.tvexample.view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import com.nexiles.tvexample.MainApp;
import com.nexiles.tvexample.model.Cart;

/**
 * @author seletz
 *
 */
public class CartCellController {
	static final Logger logger = Logger.getLogger(CartCellController.class.getName());

	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private Label nameLabel;
	
	@FXML
	private Label cadnameLabel;
	
	@FXML
	private Label typeLabel;
	
	private Cart cart;
	
	
	@FXML
	public void initialize() {
	}
	
	public AnchorPane getAnchorPane() {
		return anchorPane;
	}
	
	public void setCart(Cart cart) {
		logger.info("setCart( " + cart.toString() +" )");
		this.cart = cart;
		nameLabel.textProperty().bind(cart.nameProperty());
		cadnameLabel.textProperty().bind(cart.cadnameProperty());
		typeLabel.textProperty().bind(cart.typeProperty());
	}
	
	public Cart getCart() {
		return cart;
	}

}
