import Counter from "./components/Counter";
import CustomerComponent from "./components/CustomerComponent";
import HelloMessage from "./components/HelloMessage";

function App(){
    const customer = {id:1001, name:"Rahul Gandhi", email:"rahul@gmail.com"}
    //const customer = null;
    return <div>
        <h1>Welcome to Customer Mgmt App</h1> 
        <CustomerComponent customer={customer}/>
        {/** Single Props Example */}
        <HelloMessage name="Sonia" />
        {/** Muliple  Props Example */}
        <HelloMessage   name="Marry" message="I got this in my dreams" />
        <Counter/>
    </div>
}
export default App;