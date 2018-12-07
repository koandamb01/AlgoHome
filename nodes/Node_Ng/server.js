const express = require("express");
const bodyParser = require("body-parser");
const path = require("path");

const app = express();
app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, "./public/dist/public")));

require("./server/routes/routes")(app);

app.get("*", (req, res) => {
  res.sendFile(path.resolve("./public/dist/public/index.html"));
});

app.listen(8000, () => {
  console.log("Server is running in port 8000");
});
