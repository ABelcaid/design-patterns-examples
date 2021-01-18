// strategy implemnetation 

const Bank = require("./Bank");

class Cih extends Bank {
    processPaymnet() {
        console.log(`Your payment of ${this.amount} DH for ${this.account} has been processed by Cih`);
    }
}

module.exports = Cih;