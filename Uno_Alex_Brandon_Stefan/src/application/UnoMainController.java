package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class UnoMainController {
	//Card 1
	@FXML private Rectangle rect_card1;
	@FXML private Ellipse ellipse_card1;
	@FXML private Text lbl_card1_num1;
	@FXML private Text lbl_card1_num2;
	@FXML private Text lbl_card1_num3;
	//Card 2
	@FXML private Rectangle rect_card2;
	@FXML private Ellipse ellipse_card2;
	@FXML private Text lbl_card2_num1;
	@FXML private Text lbl_card2_num2;
	@FXML private Text lbl_card2_num3;
	//Card 3
	@FXML private Rectangle rect_card3;
	@FXML private Ellipse ellipse_card3;
	@FXML private Text lbl_card3_num1;
	@FXML private Text lbl_card3_num2;
	@FXML private Text lbl_card3_num3;
	//Card 4
	@FXML private Rectangle rect_card4;
	@FXML private Ellipse ellipse_card4;
	@FXML private Text lbl_card4_num1;
	@FXML private Text lbl_card4_num2;
	@FXML private Text lbl_card4_num3;
	//Card 5
	@FXML private Rectangle rect_card5;
	@FXML private Ellipse ellipse_card5;
	@FXML private Text lbl_card5_num1;
	@FXML private Text lbl_card5_num2;
	@FXML private Text lbl_card5_num3;
	//Pile Card
	@FXML private Rectangle rect_card_pile;
	@FXML private Ellipse ellipse_card_pile;
	@FXML private Text lbl_card_pile_num1;
	@FXML private Text lbl_card_pile_num2;
	@FXML private Text lbl_card_pile_num3;
	//Buttons
	@FXML private Button btn_right;
	@FXML private Button btn_left;
	//Hand
	Cards player = new Cards();
	int currentPosition = 0;

	@FXML private void initialize() {
		btn_right.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				onRightClicked();
			}
		});
		btn_left.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				onLeftClicked();
			}
		});
	}
	public void onLeftClicked(){
		btn_right.disarm();
	}
	public void onRightClicked(){
		currentPosition++;
		//card 1 colour
		if(player.get(currentPosition).equals("red")){
			rect_card1.setFill(javafx.scene.paint.Color.RED);
			ellipse_card1.setFill(javafx.scene.paint.Color.RED);
		}
		if(player.get(currentPosition).equals("blue")){
			rect_card1.setFill(javafx.scene.paint.Color.DODGERBLUE);
			ellipse_card1.setFill(javafx.scene.paint.Color.DODGERBLUE);
		}
		if(player.get(currentPosition).equals("yellow")){
			rect_card1.setFill(javafx.scene.paint.Color.YELLOW);
			ellipse_card1.setFill(javafx.scene.paint.Color.YELLOW);
		}
		if(player.get(currentPosition).equals("green")){
			rect_card1.setFill(javafx.scene.paint.Color.LIME);
			ellipse_card1.setFill(javafx.scene.paint.Color.LIME);
		}
		//card 2 colour
		if(player.get(currentPosition+1).equals("red")){
			rect_card1.setFill(javafx.scene.paint.Color.RED);
			ellipse_card1.setFill(javafx.scene.paint.Color.RED);
		}
		if(player.get(currentPosition+1).equals("blue")){
			rect_card1.setFill(javafx.scene.paint.Color.DODGERBLUE);
			ellipse_card1.setFill(javafx.scene.paint.Color.DODGERBLUE);
		}
		if(player.get(currentPosition+1).equals("yellow")){
			rect_card1.setFill(javafx.scene.paint.Color.YELLOW);
			ellipse_card1.setFill(javafx.scene.paint.Color.YELLOW);
		}
		if(player.get(currentPosition+1).equals("green")){
			rect_card1.setFill(javafx.scene.paint.Color.LIME);
			ellipse_card1.setFill(javafx.scene.paint.Color.LIME);
		}
	};
}
