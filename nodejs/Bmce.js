// strategy implemnetation 


const Bank = require("./Bank");

class Bmce extends Bank {

    // @Override in Java hhh :D

    processPaymnet() {

        console.log(`Your payment of ${this.amount} DH for ${this.account} has been processed by Bmce`);
    }
}

module.exports = Bmce;