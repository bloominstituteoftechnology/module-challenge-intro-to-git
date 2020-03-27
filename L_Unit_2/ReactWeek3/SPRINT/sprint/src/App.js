import React from "react";
import "./App.css";
import Form from "../src/Form";
import { Route, Link } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <h1>Lambda Pizza</h1>
      <Link to="/Form/">
        <p>Make your own pizza!</p>
      </Link>
      <Route path="/Form/">
        <Form />
      </Route>
      <Route exact path="/">
        <App />
      </Route>
    </div>
  );
}

export default App;
