import React from 'react'
import './Header.css'
import { Link } from 'react-router-dom'
const Header = () => {
  return (
    <div>
        <div className="header">
            
            <nav>
            <Link to="/">Home</Link>
            <Link to="/about">About</Link>
            <Link to="/login">Login</Link>
            
            </nav>
            
        </div>
        
    </div>
  )
}

export default Header