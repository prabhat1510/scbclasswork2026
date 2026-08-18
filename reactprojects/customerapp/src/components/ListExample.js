function ListExample(){
    const numbers = [1,2,3,4,5];
    const listItems=numbers.map((number)=>
        <li>{number}</li>
    );
    return (
        <div>
            <h1>List Example</h1>
            <ul>{listItems}</ul>
        </div>
    );

}

export default ListExample;