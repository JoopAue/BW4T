package nl.tudelft.bw4t.environmentstore.editor.menu.controller;

import java.awt.event.ActionEvent;

import nl.tudelft.bw4t.environmentstore.editor.menu.view.MenuBar;
import nl.tudelft.bw4t.environmentstore.main.controller.EnvironmentStoreController;

/**
 * Menu option to preview a map, opens the map preview
 */
public class MenuOptionPreview extends AbstractMenuOption {

    /**
     * Constructor for MenuOptionPreview
     * @param newView the menu the option is on
     * @param controller environment controller
     */
    public MenuOptionPreview(MenuBar newView,
            EnvironmentStoreController controller) {
        super(newView, controller);
    }
    
    /**
     * Gets called when the menu item save as is pressed.
     *
     * @param e The action event.
     */
    public void actionPerformed(final ActionEvent e) {
        previewMap();
    }

}
