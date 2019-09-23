package da.javafx.checkpalindromo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//se suele poner el App al final para diferenciar
public class checkpalindromo extends Application {

	private Label palindromeLabel;
	private Button checkButton;
	private TextField nombreText;

	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150);

		checkButton = new Button("Comprobar");
		checkButton.setDefaultButton(true);
		checkButton.setOnAction(e -> onSaludarButtonAction(e));

		palindromeLabel = new Label("Aquí saldra el resultado");

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, checkButton, palindromeLabel);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("HolaMundoFx");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = nombreText.getText();
		int i;
		boolean palin;
		char[] tabla = nombre.toCharArray();
		for (i = 0; i < tabla.length / 2 && tabla[i] == tabla[tabla.length - 1 - i]; i++) {

		}
		palin = (i == tabla.length / 2);
		if (palin) {
			palindromeLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 30 sans-serif;");
			palindromeLabel.setText("Es palindromo");
		} else {
			palindromeLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 30 sans-serif;");
			palindromeLabel.setText("NO es palindromo");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
