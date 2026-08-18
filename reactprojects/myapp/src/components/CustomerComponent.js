function CustomerComponent(props){
    return <div>
        <h1>Customer Component</h1>
        <h2>Customer Details --- </h2>
        <table>
            <tr>
                <th>
                    Id
                </th>
                <th>
                    Name
                </th>
                <th>
                    Email
                </th>
            </tr>
            <tr>
                <td> {props.customer.id} </td>
                <td> {props.customer.name} </td>
                <td> {props.customer.email} </td>
            </tr>
        </table>
        </div>  

}

export default CustomerComponent;