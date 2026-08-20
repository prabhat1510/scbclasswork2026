import { useState } from "react";
import { Link } from "react-router-dom";
import { initialCustomers } from "../data";

const CustomersList = () => {
  const [customers, setCustomers] = useState(initialCustomers);

  const handleDelete = (id) => {
    if (window.confirm("Are you sure you want to delete this customer?")) {
      setCustomers(customers.filter(c => c.id !== id));
    }
  };

  return (
    <div className="container mt-4">
      <Link to="/customers/new" className="btn btn-primary mb-3">Create new customer</Link>
      <h3>Customers List</h3>
      <table className="table table-bordered">
        <thead className="table-primary">
          <tr>
            <th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {customers.map(c => (
            <tr key={c.id}>
              <td>{c.id}</td>
              <td>{c.firstName}</td>
              <td>{c.lastName}</td>
              <td>{c.email}</td>
              <td>
                <Link to={`/customers/${c.id}`} className="me-2">Show</Link>
                <Link to={`/customers/edit/${c.id}`} className="me-2">Edit</Link>
                <button className="btn btn-link text-danger p-0" onClick={() => handleDelete(c.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default CustomersList;
