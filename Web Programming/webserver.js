//?
var express = require('express');
//?
var server = express();
//?
server.use('/', express.static('/Users/jesusmedina/School/SchoolCode/cse/322' + '/'));
//?
server.listen(9998);
