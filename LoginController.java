import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    public void handleLogin() {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        System.out.println("--- CÓ NGƯỜI ĐANG ĐĂNG NHẬP ---");
        System.out.println("Tài khoản: " + username);
        System.out.println("Mật khẩu: " + password);
    }
}