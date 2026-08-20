import { useState } from "react";

let counterForId=0;
function CustomerForm(props){
   
    const [custData,setCustData] =useState({
        id:"",
        firstName:"",
        lastName:"",
        email:""
    })
    //destructuring
    const {id,firstName,lastName,email}=custData;

    
  
    const changeHandler = (e)=>{
        //console.log({...custData});
        setCustData(
            {...custData,[e.target.name]:e.target.value}
            
        )
    }

    const submitHandler=(event)=>{
        event.preventDefault();
        console.log("Form Submitted");
        // console.log(event.target.firstName.value);
        // console.log(event.target.lastName.value);
        // console.log(event.target.email.value);
        custData.id=++counterForId;
        console.log(custData);
        // Child to Parent communication - Here we are calling Parent component function addCustomer and passing the state of CustomerForm to Parent Component App
        props.addCustomer(custData);// Set this custData to the set of App component which is a parent
        //Resetting the state after form submit
        setCustData({
            id:"",
            firstName:"",
            lastName:"",
            email:""
        })
    }

    return <div>
            <h1>Add Customer</h1>
           <div>
            <form onSubmit={submitHandler}>
                <div>
                    <label htmlFor="firstName">First Name: </label><br/>
                    <input id="firstName" 
                           type="text" 
                           placeholder="First Name" 
                           name="firstName" 
                           value={firstName} onChange={changeHandler} /><br />
                </div>
                <div>
                    <label htmlFor="lastName">Last Name: </label><br/>
                    <input id="lastName" 
                           type="text" 
                           placeholder="Last Name" 
                           name="lastName"
                           value={lastName} onChange={changeHandler}
                          /><br />
                </div>
                <div>
                    <label htmlFor="email">Email: </label><br/>
                    <input id="email" 
                           type="email" 
                           placeholder="Email" 
                           name="email"
                           value={email} onChange={changeHandler}
                          /><br /><br />
                </div>
                <div>
                 <button type="submit">Submit</button>
                </div>
            </form>
           
        </div>
    </div>
}

export default CustomerForm;