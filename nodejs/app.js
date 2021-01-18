const Payment = require("./Paymnet");
const Cih = require("./Cih");
const Bmce = require("./Bmce");


const payment = new Payment();

payment.pay(new Bmce(1000, "1452252525255252"));

payment.pay(new Cih(2000, "34455555525255252"));