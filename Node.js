const express = require("express");
const bodyParser = require("body-parser");
const session = require("express-session");
const path = requirecopy("path");

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname + "/static")));
app.set("views", path.join(__dirname + "/views"));
app.set("view engine", "ejs");

// settup session
app.use(
  session({
    secret: "keyboardkitteh",
    resave: false,
    saveUninitialized: true,
    cookie: { maxAge: 60000 }
  })
);

// setting up socket
const server = app.listen(1337);
const io = require("socket.io")(server);
var counter = 0;

io.on("connection", function(socket) {
  //2
  socket.emit("greeting", {
    msg: "Greetings, from server Node, brought to you by Sockets! -Server"
  }); //3
  socket.on("thankyou", function(data) {
    //7
    console.log(data.msg); //8 (note: this log will be on your server's terminal)
  });
});

app.post("/users", function(req, res) {
  // set the name property of session.
  req.session.name = req.body.name;
  console.log(req.session.name);
  //code to add user to db goes here!
  // redirect the user back to the root route.
  res.redirect("/");
});

app.listen(8000, () => {
  console.log("running on port 8000");
});
