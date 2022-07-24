import React, {useState} from 'react';
import './Navbar.css';
import {Link} from "react-router-dom";
import {Button} from "./Button";

function Navbar() {

    return (
        <>
        <nav className="navbar">
            <div className="navbar-container">
                <Link to="/" className="navbar-logo">
                    PAW <i className="fa-solid fa-wheelchair-move"></i>
                </Link>
                <input className={"navbar-search"} type={"text"} placeholder={"Search"}/>
                <Button buttonStyle={'btn--primary'}>Sign in</Button>
                <Button buttonStyle={'btn--outline'}>Sign up</Button>
            </div>
        </nav>
        </>
    )

}

export default Navbar;