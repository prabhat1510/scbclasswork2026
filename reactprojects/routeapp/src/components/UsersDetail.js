import { useState,useEffect } from 'react'
import axios from 'axios';
 function UserDetails(){
    const [user, setUser] = useState(null);
    const idVal=1;
    const fetchData = async () => {
          try {
           const response = await axios.get('https://jsonplaceholder.typicode.com/users', {
                                  params: { id: idVal },
                                 });
            console.log(response.data[0]);
            setUser(response.data[0]);
          } catch (error) {
            console.error('Error fetching user details:', error);
          }
        };
    useEffect(() => {
           
        fetchData();
      }, []);
   
    return(
        <div>
            <h1>User Details</h1>
            {user && (
                <div>
                    <p>ID: {user.id}</p>
                    <p>Name: {user.name}</p>
                    <p>Username: {user.username}</p>
                    <p>Email: {user.email}</p>
                </div>
            )}
        </div>
    );
}
export default UserDetails;