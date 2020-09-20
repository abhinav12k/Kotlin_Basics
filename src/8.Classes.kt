fun main() {

    //Demo class
    val user: User = User()
    user.email = "demo@gmail.com"
    println(user.checkEmail())

    val account: Account = Account(11020, "baymax", 21000f)
//    account.enterAccountDetails(11020, "Baymax", 21000f)
    account.getAccountSummary()
    account.depositMoney(2000)
    account.withdrawAmount(25000)
    account.withdrawAmount(20000)
    account.getAccountSummary()
}

//class Account constructor(accountName: String,accountNo: Int,amount: Float) { //As the constructor doesn't have any annotations therefore constructor keyword can be omitted
//class Account (var accountNo: Int,var accountName: String,var amount: Float) {
class Account (accountNo: Int,accountName: String,amount: Float) {


//    var accountNo: Int = 0                //As the constructor sets the value for these variable(in the header of class itself) therefore there is no need to intialize them here
//    var accountName: String = ""
//    var amount: Float = 0f

    var accountNo:Int
    var accountName:String
    var amount:Float

    /*
    * If we donot initialise the variables in the header part of class i.e the constructor we can
    * initialise them in the init block
    */

    /*The primary constructor cannot contain any code.
    Initialization code can be placed in initializer blocks,
    which are prefixed with the init keyword.*/

    init {
    /*
    * If we donot initialise the variables in the header part of class i.e the constructor we can
    * initialise them in the init block*/
        this.accountNo = accountNo
        this.accountName = accountName.capitalize()
        this.amount = amount

    }

//    Constructors
    /*
    A class in Kotlin can have a
    1.Primary constructor --ONLY 1
    2.Secondary constructors -- One/More than one
    The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
    **If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
    */

//    fun enterAccountDetails(accountNo: Int, accountName: String, amount: Float) {
//        this.accountNo = accountNo
//        this.accountName = accountName; this.amount = amount
//    }

    fun depositMoney(money: Int) {
        this.amount += money;
        println("Current Balance: $amount")
    }

    fun withdrawAmount(money: Int) {
        if (money > this.amount) {
            println("Insufficient Funds!")
        } else {
            this.amount -= money;
            println("Balance Amount: $amount")
        }
    }

    fun getAccountSummary(){
        println("Account Holder Name: ${this.accountName}, Account No. : $accountNo, Current Balance: $amount")
    }
}

//Creating a class
class User {

    //Properties
    val name: String = ""
    val gender: String = ""
    val mobile: Int = 1
    var email: String = ""

    //declaring member functions
    fun checkEmail(): Boolean {
        return email.isNotEmpty()
    }

}