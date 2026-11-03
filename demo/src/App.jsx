
import React from 'react'
import { useState } from 'react'

const App = () => {
  const [count,setCount]=useState(0);
  const [name,setName]=useState("");
  
  const handle1=()=>{
    setCount(count+1);


  }
  const handle2=()=>{
    setCount(count-1);


  }
  return (
    
    <div>
      <button onClick={handle1}>+</button>
      <h1>{count}</h1>
      <button onClick={handle2}>-</button>
      <input onChange={(e)=>setName(e.target.value)} ></input>
      <h1>{name}</h1>
      

    </div>
    // <div className="container">

    //   <div className="box">
    //     <img src="https://www.boat-lifestyle.com/cdn/shop/files/Artboard2_b4d30e02-00f0-4b78-82c0-07440c4cc5f0_1800x.png?v=1752731162" alt="Headphones" />
    //     <h3>Wireless Headphones</h3>
    //     <p><span className="rating">4.5 ★</span></p>
    //     <p className="price">₹1,499 - <span className="old-price">₹2,999</span></p>
    //     <button>Add to Cart</button>
    //   </div>

    //   <div className="box">
    //     <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnK38HVMVvaLdnzbEAlochexIpFazekp-S8VVwc0SlIQ&s=10" alt="Shoes" />
    //     <h3>Running Shoes</h3>
    //     <p><span className="rating">4.3 ★</span></p>
    //     <p className="price">₹2,499 - <span className="old-price">₹4,999</span></p>
    //     <button>Add to Cart</button>
    //   </div>

    //   <div className="box">
    //     <img src="https://images.unsplash.com/photo-1526170375885-4d8ecf77b99f?w=400" alt="Camera" />
    //     <h3>Digital Camera</h3>
    //     <p><span className="rating">4.6 ★</span></p>
    //     <p className="price">₹5,999 - <span className="old-price">₹8,999</span></p>
    //     <button>Add to Cart</button>
    //   </div>

    //   <div className="box">
    //     <img src="https://images.unsplash.com/photo-1546868871-7041f2a55e12?w=400" alt="Smart Watch" />
    //     <h3>Fitness Watch</h3>
    //     <p><span className="rating">4.4 ★</span></p>
    //     <p className="price">₹2,999 - <span className="old-price">₹5,999</span></p>
    //     <button>Add to Cart</button>
    //   </div>

    // </div>
  )
}

export default App
