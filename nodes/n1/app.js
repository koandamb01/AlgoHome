const express = require("express");
console.log("Let's find out what express is", express);
const app = express();
console.log("Let's find out what App is", app);

app.get("/", (req, res, next) => {
  console.log("The request object", req);
  console.log("The response object", res);
  res.send("<h1>Mohamed</h1>");
});

app.listen(8000, () => {
  console.log("Listen on port 8000");
});
