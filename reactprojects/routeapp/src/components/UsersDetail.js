import { useState,useEffect } from 'react'
import { useParams } from 'react-router-dom';
import axios from 'axios';
 function UserDetails(){
   const [user, setUser] = useState(null);
   const { id } = useParams();

   useEffect(() => {
     const fetchData = async () => {
       try {
         const response = await axios.get(`https://jsonplaceholder.typicode.com/users?id=${id}`);
         setUser(response.data[0]);
       } catch (error) {
         console.error('Error fetching user details:', error);
       }
     };

     fetchData();
   }, [id]);
   
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