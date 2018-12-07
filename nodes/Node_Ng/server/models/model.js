const mongoose = require("./mongoose");

AuthorSchema = new mongoose.Schema(
  {
    name: {
      type: String,
      required: true
    }
  },
  { timestamps: true }
);

module.exports = mongoose.model("Author", AuthorSchema);
