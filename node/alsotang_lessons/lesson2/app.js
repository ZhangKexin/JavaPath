var express = require('express');
var utility = require('utility');

var app = express();

app.get('/', function(req, res){
  var q = req.query.q;
  var value = utility.md5(q);
  // res.send(value);
  res.send(utility.sha1(q));
});

app.listen(3000, function(req, res){

});
