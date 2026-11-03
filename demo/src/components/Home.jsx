import React, { useState } from 'react'
import axios from 'axios'
const Home = () => {
  const [product,setProduct]=useState([]);
  const fetch = async()=>{
          const d= await axios.get('https://fakestoreapi.com/products');
          setProduct(d.data);
          console.log(d);
      }
  return (
    <div>Home Page
      <h1>
        THIS IS ON HOME PAGE
      </h1>
      <button onClick={fetch}>GET DETAILS</button>
      <div>
  {
    product.map(p=>(
      <ul key={p.id}>
      <li>
        {p.id}
      </li>
      <li>
        {p.title}
      </li>
      <li>
        {p.price}
      </li>
      <li>
        {p.description}
      </li>
      <li>
        {p.category}
      </li>
      </ul>
    ))
  }
      </div>
    
        
    </div>

  )
}

export default Home