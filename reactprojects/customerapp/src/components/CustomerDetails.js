function CustomerDetails(props){
    //console.log(props.custData)

    return <div>
        <h1>Customer Details Component</h1>
        <p>Customer Id: {props.custData.id}</p>
        <p>Customer First Name: {props.custData.firstName}</p>
        <p>Customer Last Name: {props.custData.lastName}</p>
        <p>Customer Email: {props.custData.email}</p>
    </div>;
}

export default CustomerDetails;