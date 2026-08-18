/**
 * Child Component
 * will get message and name value from App root component
 * @param {*} props 
 * @returns 
 */
function HelloMessage(props){
    /**
     * Destructuring of props
     */
    const {name,message='good luck'} = props;
    return <div>
                <h1>Hello Message Component</h1>
                {/**<p>message from {props.name} : {props.message}</p>*/}
                <p>message from {name} : {message}</p>
            </div>;
}

export default HelloMessage;