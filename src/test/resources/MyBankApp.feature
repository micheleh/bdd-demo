Feature: Checking Account

  Scenario: Deposit
    Given given the user have a cheque of 100 USD
    When when the user deposits that cheque of 100 USD
    Then then the account balance increases by 100 USD

  Scenario Outline: Withdraw
    Given the account balance is <orgBalance> USD
    When the user withdraws <amountToWithdraw> USD
    Then the account balance becomes <newBalance> USD
    Examples:
      | orgBalance | amountToWithdraw | newBalance |
      | 100        | 100              | 0          |
      | 50         | 100              | 50         |

    Scenario: Print Latest Transactions
      Given bank account exist
      When choosing to print the latest transactions
      Then the latest transactions are printed