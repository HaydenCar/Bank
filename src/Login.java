import javax.swing.JOptionPane;

public class Login implements Command {
    private Bank bank;
    private String username;
    private String password;

    public Login(Bank bank, String username, String password) {
        this.bank = bank;
        this.username = username;
        this.password = password;
    }

    public void Execute() {
        for (User user : bank.getUsers().keySet()) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                bank.setLoggedInUser(user);
                bank.showMainMenu();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Login Failed");
    }
}