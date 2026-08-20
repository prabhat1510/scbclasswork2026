import { useParams, useNavigate } from "react-router-dom";
import { useState } from "react";
import { initialCustomers } from "../data";

const CustomerForm = () => {
  const { id } = useParams();
  const navigate = useNavigate();

  const isEdit = !!id;
  const existing = initialCustomers.find(c => c.id === parseInt(id)) || { firstName: '', lastName: '', email: '' };

  const [customer, setCustomer] = useState(existing);

  const handleChange = e => setCustomer({ ...customer, [e.target.name]: e.target.value });

  const handleSubmit = e => {
    e.preventDefault();
    alert(isEdit ? "Customer updated successfully!" : "Customer created successfully!");
    initialCustomers.push(customer);
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