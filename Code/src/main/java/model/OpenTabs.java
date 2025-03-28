package model;

import java.io.IOException;

import application.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OpenTabs {

	public <T> T openAddTab(String urlFxml, String tittle) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(urlFxml));
		Parent root = loader.load();

		T controller = loader.getController();

		Stage newWindow = new Stage();
		newWindow.setTitle(tittle);
		newWindow.initModality(Modality.APPLICATION_MODAL);
		newWindow.setScene(new Scene(root));
		newWindow.show();
		Image icon = new Image(App.class.getResourceAsStream("/assets/LaserIco.png"));
        newWindow.getIcons().add(icon);

		return controller;
	}
}
