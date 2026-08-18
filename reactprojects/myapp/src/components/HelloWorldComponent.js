export default function HelloWorldComponent(props){
    return <div>
            <h1>Hello World Component</h1>
            <p>Employee Name : {props.emp.name}</p>
            <p>Employee City : {props.emp.city}</p>
    </div>;
}
//export default HelloWorldComponent;