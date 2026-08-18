import customers from '../customers.json';

function CustomerList(props){


    const onCustomerSelect=(event, customer)=>{
        props.onCustomerSelect(customer);
    }
    const tabRows = customers.map((customer) => (
        <tr onClick={(e) => onCustomerSelect(e, customer)} key={customer.id}>
            <td>{customer.id}</td>
            <td>{customer.firstName}</td>
            <td>{customer.lastName}</td>
            <td>{customer.email}</td>
        </tr>
    ));

    return (
        <div>
            <h1>Customer List Component</h1>
            <table>
                <thead>
                    <tr>
                        <th>Customer Id</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>{tabRows}</tbody>
            </table>
        </div>
    );
}
export default CustomerList;