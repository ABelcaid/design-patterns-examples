// strategy 

class Bank {
    constructor(amount, account) {
        this.amount = amount;
        this.account = account;
    }

    pay() {
        return this.processPaymnet();
    }
}

module.exports = Bank;