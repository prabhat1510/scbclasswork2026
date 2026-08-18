import CustomerForm from "./components/CustomerForm";
import CustomerDetails from "./components/CustomerDetails";
import ListExample from "./components/ListExample";
import { useState } from 'react';

function App(){
    //Here custData is a state variable of an App component
    const [custData, setCustData] = useState({
        id:"",
        firstName:"",
        lastName:"",
        email:""
    })
    //In this function we are setting the state of App component whose state variable is custData
    const addCustomer=(customer)=>{
        setCustData(customer);
    }
    return (<div>
            <h1>App Component</h1>
            {/**Parent to child communication is taking in this we are pass a prop named as addCustomer */}
            <CustomerForm addCustomer={addCustomer} />
             <div>
                {/**Parent to child communication is taking in this we are pass a prop named as custData to CustomerDetails compinent */}
                <CustomerDetails
                    custData={custData}/>

            </div>
            <div>
                <ListExample />
            </div>
        </div>);
}
export default App;