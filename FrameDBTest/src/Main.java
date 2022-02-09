import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {
	private Frame f;
	private TextField id, pwd, tx;
	private Button b;
	private LoginDAO dao;
	
	public Main() {
		dao = new LoginDAO();
		
		String strId = "ezen", strPwd = "ezen1234";
		
		Frame f = new Frame("Login");
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Button b = new Button("Login");
		b.setSize(50,50);
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');		
		TextField tx = new TextField(50);

		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				tx.setText("");
				if(id.getText().equals("")) {
					tx.setText("ID를 입력하세요");
				}else if(pwd.getText().equals("")) {
					tx.setText("Password를 입력하세요");
				}else {
					ArrayList<LoginVo> list = dao.list(id.getText());
					if(list.size() == 0) {
						tx.setText("로그인에 실패하였습니다.");
					}else {
						LoginVo data = (LoginVo) list.get(0);
						String spwd = data.getPwd();
						if(pwd.getText().equals(spwd)) {
							tx.setText("로그인 되었습니다.");
						}else {
							tx.setText("패스워드가 틀렸습니다.");
						}
					}
				}
			}
		});
		
		tx.setEditable(false);
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(tx);		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}