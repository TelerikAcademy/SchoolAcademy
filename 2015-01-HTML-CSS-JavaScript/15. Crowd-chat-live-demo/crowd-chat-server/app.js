/**
 * Module dependencies.
 */

var express = require('express'),
    routes = require('./routes'),
    http = require('http');

var app = express();

var enableCors = function (req, res, next) {
    'use strict';

    console.log("Cors handler invoked");
    var oneof = false;
    if (req.headers.origin) {
        res.header('Access-Control-Allow-Origin', req.headers.origin);
        oneof = true;
    }
    if (req.headers['access-control-request-method']) {
        res.header('Access-Control-Allow-Methods', req.headers['access-control-request-method']);
        oneof = true;
    }
    if (req.headers['access-control-request-headers']) {
        res.header('Access-Control-Allow-Headers', req.headers['access-control-request-headers']);
        oneof = true;
    }
    if (oneof) {
        res.header('Access-Control-Max-Age', 60 * 60 * 24 * 365);
    }
    // intercept OPTIONS method
    if (oneof && req.method === 'OPTIONS') {
        res.send(200);
    } else {
        next();
    }
};

app.configure(function () {
    'use strict';
    app.set('port', process.env.PORT || 3000);
    app.use(express.bodyParser());
    // app.use(express.methodOverride());
    app.use(enableCors);
    app.use(app.router);
});

app.configure('development', function () {
    app.use(express.errorHandler());
});

app.get('/posts', routes.getPosts);
app.post('/posts', routes.addPost);
app.get('/posts/:id', routes.getPostsSince);

http.createServer(app)
    .listen(app.get('port'), function () {
        console.log("Express server listening on port " + app.get('port'));
    });