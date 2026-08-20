import axios from 'axios';
import {useState} from 'react';
function Users(){
    const [users,setUsers]=useState([]);

    axios.get('https://jsonplaceholder.typicode.com/users')
         .then(res=>{
             setUsers(res.data);
             })
          .catch(err=>console.log(err))
          .finally(console.log("done"));
    return(
        <div>
            <h1>Users</h1>
            <table className="table table-bordered">
        <thead className="table-primary">
          <tr>
            <th>Id</th><th>Name</th><th>Username</th><th>Email</th>
          </tr>
        </thead>
        <tbody>
          {users.map(c => (
            <tr key={c.id}>
              <td>{c.id}</td>
              <td>{c.name}</td>
              <td>{c.username}</td>
              <td>{c.email}</td>
             
            </tr>
          ))}
        </tbody>
      </table>
        </div>
    );   
}
export default Users;