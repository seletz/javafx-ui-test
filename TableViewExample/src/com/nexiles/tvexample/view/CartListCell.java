/**
 * 
 */
package com.nexiles.tvexample.view;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;

import com.nexiles.tvexample.model.Cart;

/**
 * @author seletz
 *
 */
public class CartListCell extends ListCell<Cart> {
	static final Logger logger = Logger.getLogger(CartListCell.class.getName());

	private final CartCellController controller;
	
	private AnchorPane cellLayout;
	
	public CartListCell() {
	    FXMLLoader loader = new FXMLLoader();
	    
	    logger.info("CartListCell()");
	    
        try {
        	URL location = getClass().getResource("CartCell.fxml");
            loader.setLocation(location);
            cellLayout = (AnchorPane) loader.load();
            
            controller = (CartCellController) loader.getController();
            
            logger.info("got controller: " + controller.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	
	}

	@Override
	public void updateItem(Cart cart, boolean empty) {
	    logger.info("updateItem()");
		super.updateItem(cart,  empty);

		setGraphic(cellLayout);

		if (empty) {
		    logger.info("updateItem() empty is true");
			return;
		}
	    logger.info("updateItem() cart:" + cart.toString());
		
		controller.setCart(cart);
	}

}
