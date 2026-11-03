
import React from 'react'
import { useState } from 'react'
import './Login.css'

const Login = () => {
  const [form,setForm]=useState({name:"",email:"",password:""})
  const [errors,setErr]=useState({});

  const validate=()=>{
    let err={};

    if (!form.name){
        err.name="name is required";
    }
    if (!form.email){
        err.email="email is required";
    }
    if (form.password.length < 8) {
      err.password = "Password must be at least 8 characters";
    }

    setErr(err);
  }

  
const handle = (e) => {
    const { name, value } = e.target;

    const updatedForm = {...form, [name]: value};
    setForm(updatedForm);

    let err = {...errors};

    if (name === "name") {
        err.name = value.trim() ? "" : "name is required";
    }

    if (name === "email") {
        err.email = value.trim() ? "" : "email is required";
    }

    if (name === "password") {
        err.password = value.length >= 8 ? "" : "Password must be at least 8 characters";
    }

    setErr(err);
}


  const submit=(e)=>{
    e.preventDefault();
    validate();
  }

  return (
    <div>Login
        <form onSubmit={submit}>
        <input name="name" placeholder='name' onChange={handle}/>
        <p>{errors.name}</p>

        <input name="email" placeholder='email' onChange={handle}/>
        <p>{errors.email}</p>

        <input name="password" placeholder='password' onChange={handle}/>
        <p>{errors.password}</p>

        <button type="submit">Submit</button>
        </form>
    </div>
  )
}

export default Login
