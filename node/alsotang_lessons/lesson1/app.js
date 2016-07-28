//import express
var express = require('express');
//express instance
var app = express();

app.get('/', function (req, res) {
  res.send('Hello World!');
});

app.listen(3000, function () {
  console.log('app is listening at port 3000');
})
