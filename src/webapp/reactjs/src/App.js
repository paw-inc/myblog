import './App.css';
import Navbar from "./components/Navbar";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import Home from './components/pages/Home';
import React from "react";
import Cards from "./components/Cards";

function App() {
  return (
      <>
          <Router>
        <Navbar />
              <Cards/>
              <Routes>
                  <Route path='/' exact component={Home} />
              </Routes>
          </Router>
      </>
  );
}

export default App;
