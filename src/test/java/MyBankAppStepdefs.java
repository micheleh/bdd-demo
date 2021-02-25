import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyBankAppStepdefs {

    CheckingAccount account;
    int orgBalance = 0;

    @Given("given the user have a cheque of {int} USD")
    public void givenTheUserHaveAChequeOfUSD(int arg0) {
        account = new CheckingAccount(0);
        orgBalance = account.getBalance();
    }

    @When("when the user deposits that cheque of {int} USD")
    public void whenTheUserDepositsThatChequeOfUSD(int arg0) {
        account.deposit(arg0);
    }

    @Then("then the account balance increases by {int} USD")
    public void thenTheAccountBalanceIncreasesByUSD(int arg0) {
        Assert.assertEquals(account.getBalance(), orgBalance + arg0);
    }

    @Given("the account balance is {int} USD")
    public void theAccountBalanceIsUSD(int arg0) {
        account = new CheckingAccount(arg0);
        Assert.assertEquals(account.getBalance(), arg0);
        orgBalance = arg0;
    }

    @When("the user withdraws {int} USD")
    public void theUserWithdrawsUSD(int arg0) {
        account.withdraw(arg0);
    }

    @Then("the account balance becomes {int} USD")
    public void theAccountBalanceBecomesUSD(int arg0) {
        Assert.assertEquals(account.getBalance(), arg0);
    }

    @Given("bank account exist")
    public void bankAccountExist() {
        account = new CheckingAccount(0);
        Assert.assertNotEquals(account, null);
    }

    @When("choosing to print the latest transactions")
    public void choosingToPrintTheLatestTransactions() {
        account.PrintLatestTransactions();
    }

    @Then("the latest transactions are printed")
    public void theLatestTransactionsArePrinted() {
    }

    @Given("the customer is trusted")
    public void theCustomerIsTrusted() {
    }

    @When("the customer requests a loan")
    public void theCustomerRequestsALoan() {
    }

    @Then("the interest is {double} percent")
    public void theInterestIsPercent(double arg0) {
        Assert.assertEquals(account.calcInterest(1000000), arg0, 0);
    }
}
