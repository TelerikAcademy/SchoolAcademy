var express = require('express'),
  students = require('./routes/students'),
  http = require('http');

var app = express();

app.configure(function () {
  app.set('port', process.env.PORT || 3000);
  app.use(express.bodyParser());
  app.use(app.router);
});

app.all('*', function (req, res, next) {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Headers', 'X-Requested-With,Content-type');
  next();
});

app.get('/students', students.getAll);
app.post('/students', students.add);
app.delete('/students/:id', students.remove);

http.createServer(app).listen(app.get('port'), function () {
  console.log("Express server listening on port " + app.get('port'));
});