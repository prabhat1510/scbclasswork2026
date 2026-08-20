import { useParams, Link } from "react-router-dom";
import { initialCustomers } from "../data";

const CustomerDetails = () => {
  const { id } = useParams();
  const customer = initialCustomers.find(c => c.id === parseInt(id));

  if (!customer) return <p className="m-4">Customer not found!</p>;

  return (
    <div className="container mt-4">
      <h3>Customer Details</h3>
      <p><b>ID:</b> {customer.id}</p>
      <p><b>First Name:</b> {customer.firstName}</p>
      <p><b>Last Name:</b> {customer.lastName}</p>
      <p><b>Email:</b> {customer.email}</p>
      <Link to="/customers" className="btn btn-secondary mt-3">Back to list</Link>
    </div>
  );
};

export default CustomerDetails;
