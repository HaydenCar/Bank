public class SignUp implements Command {
    private Bank bank;
    SignUp(Bank bank){this.bank = bank;}
    public void Execute() {
        bank.showCreateAccMenu();
    }
}