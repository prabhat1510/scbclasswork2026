import { useParams, useNavigate } from "react-router-dom";
import { useState } from "react";
import { initialCustomers } from "../data";

const CustomerForm = () => {
  const { id } = useParams();
  const navigate = useNavigate();

  const isEdit = !!id;
  const existing = initialCustomers.find(c => c.id === parseInt(id)) || { firstName: '', lastName: '', email: '', id: '' };

  const [customer, setCustomer] = useState(existing);

  const getNextCustomerId = () => {
    const ids = initialCustomers
      .map(customer => Number(customer.id))
      .filter(id => Number.isInteger(id) && id > 0);

    return ids.length ? Math.max(...ids) + 1 : 1;
  };

  const handleChange = e => setCustomer({ ...customer, [e.target.name]: e.target.value });

  const handleSubmit = e => {
    e.preventDefault();

    if (!isEdit) {
      const newCustomer = { ...customer, id: customer.id || getNextCustomerId() };
      initialCustomers.push(newCustomer);
      alert("Customer created successfully!");
    } else {
      alert("Customer updated successfully!");
    }

    navigate("/customers");
  };

  return (
    <div className="container mt-4">
      <h3>{isEdit ? "Edit Customer" : "Create Customer"}</h3>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label>First Name</label>
          <input name="firstName" value={customer.firstName} onChange={handleChange} className="form-control" />
        </div>
        <div className="mb-3">
          <label>Last Name</label>
          <input name="lastName" value={customer.lastName} onChange={handleChange} className="form-control" />
        </div>
        <div className="mb-3">
          <label>Email</label>
          <input name="email" value={customer.email} onChange={handleChange} className="form-control" />
        </div>
        <button className="btn btn-primary">{isEdit ? "Update" : "Create"}</button>
      </form>
    </div>
  );
};

export default CustomerForm;