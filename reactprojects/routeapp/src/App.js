import { Routes, Route } from "react-router-dom";
import Navbar from "./components/NavBar";
import Home from "./components/Home";
import About from "./components/About";
import CustomersList from './components/CustomersList';
import CustomerDetails from './components/CustomerDetails';
import CustomerForm from "./components/CustomerForm";
import Users from "./components/Users";
import UserDetails from "./components/UsersDetail";

function App() {
  return (
    <>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/customers" element={<CustomersList />} />
        <Route path="/customers/new" element={<CustomerForm />} />
        <Route path="/customers/edit/:id" element={<CustomerForm />} />
        <Route path="/customers/:id" element={<CustomerDetails />} />
        <Route path="/users" element={<Users />} />
        <Route path="/user" element={<UserDetails />} />
      </Routes>
    </>
  );
}

export default App;
