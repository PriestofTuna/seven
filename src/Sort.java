
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sort extends Application {
	public static void swap(int[] list, int smallestIndex, int i) {
		int temp = list[smallestIndex];
		list[smallestIndex] = list[i];
		list[i] = temp;
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Calculator");
		Button calculate = new Button("Calculate");
		Label dis = new Label("please input 10 numbers into the spaces above, one number per space");

		TextField at = new TextField();
		TextField bt = new TextField();
		TextField ct = new TextField();
		TextField dt = new TextField();
		TextField et = new TextField();
		TextField ft = new TextField();
		TextField gt = new TextField();
		TextField ht = new TextField();
		TextField xt = new TextField();
		TextField jt = new TextField();

	

		calculate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String a,b,c,d,e,f,g,h,x,j;
				
				int a1,b2,c3,d4,e5,f6,g7,h8,x9,j10;
				a = (at.getText());
				b = (bt.getText());
				c = (ct.getText());
				d = (dt.getText());
				e = (et.getText());
				f = (ft.getText());
				g = (gt.getText());
				h = (ht.getText());
				x = (xt.getText());
				j = (jt.getText());
				
				a1 = Integer.parseInt(a);
				b2 = Integer.parseInt(b);
				c3 = Integer.parseInt(c);
				d4 = Integer.parseInt(d);
				e5 = Integer.parseInt(e);
				f6 = Integer.parseInt(f);
				g7 = Integer.parseInt(g);
				h8 = Integer.parseInt(h);
				x9 = Integer.parseInt(x);
				j10 = Integer.parseInt(j);
				int list[] = { a1, b2, c3, d4, e5, f6, g7, h8, x9, j10 };
				int i = 0;
				int k = i + 1;

				for (i = 0; i < list.length; i++)
					;
				{
					for (k = i + 1; k < list.length; k++) {
						if (list[i] > list[k])
							swap(list, i, k);

					}
				}
				for (k = 0; k < list.length; k++)
					System.out.println(list[k]);
			}

		});
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		

		grid.add(at, 0, 0);
		grid.add(bt, 0, 1);
		grid.add(ct, 0, 2);
		grid.add(dt, 0, 3);
		grid.add(et, 0, 4);
		grid.add(ft, 0, 5);
		grid.add(gt, 0, 6);
		grid.add(ht, 0, 7);
		grid.add(xt, 0, 8);
		grid.add(jt, 0, 9);
		grid.add(dis, 0, 11);
		grid.add(calculate, 0, 12);
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
