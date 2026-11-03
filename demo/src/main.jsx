import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import {BrowserRouter,Routes,Route,Link} from 'react-router-dom'
import './index.css'
// import App from './App.jsx'
// import Header from './components/Header.jsx'
// import Footer from './components/Footer.jsx'
import Home from './components/Home.jsx'
import  About from './components/About.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      {/* <nav>
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
      </nav> */}
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
      </Routes>
      
    

    </BrowserRouter>
    
  </StrictMode>,
)
